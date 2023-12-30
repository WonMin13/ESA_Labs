package com.example.labwork4final.service;

import com.example.labwork4final.jms.Sender;
import com.example.labwork4final.model.*;
import com.example.labwork4final.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArmyRepository armyRepository;

    @Autowired
    private Sender sender;

    public void create(Album album, Long armyId) {
        Army army = armyRepository.findById(armyId).get();
        album.setArmy(army);
        album.setId(getNextId());
        albumRepository.save(album);

        sender.sendInsert(album);
    }

    public Album get(Long id) {
        return albumRepository.findById(id).get();
    }

    public List<Album> getAll() {
        return albumRepository.findAll().stream().sorted(Comparator.comparingLong(Album::getId)).collect(Collectors.toList());
    }

    public void update(Long albumId, Album newAlbumData, Long armyId) {
        Album album = albumRepository.findById(albumId).get();
        Army army = armyRepository.findById(armyId).get();

        newAlbumData.setId(albumId);
        newAlbumData.setArmy(army);
        sender.sendUpdate(album, newAlbumData);

        album.setNameAlbum(newAlbumData.getNameAlbum());
        album.setSong(newAlbumData.getSong());
        album.setPrice(newAlbumData.getPrice());
        album.setArmy(army);
        albumRepository.save(album);
    }

    public void delete(Long id) {
        Album album = albumRepository.findById(id).get();
        album.getArmy().getAlbums().remove(album);
        albumRepository.deleteById(id);

        sender.sendDelete(album);
    }

    public Long getNextId() {
        long count = albumRepository.count();
        long id = ++count;
        while (albumRepository.existsById(id)) {
            ++id;
        }
        return id;
    }

}
