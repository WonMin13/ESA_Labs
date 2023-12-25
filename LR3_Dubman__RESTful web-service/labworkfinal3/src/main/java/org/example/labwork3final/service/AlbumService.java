package org.example.labwork3final.service;

import org.example.labwork3final.model.*;
import org.example.labwork3final.repository.*;
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

    public void create(Album album, Long armyId) {
        Army army = armyRepository.findById(armyId).get();
        album.setArmy(army);
        albumRepository.save(album);
    }

    public Album get(Long id) {
        return albumRepository.findById(id).get();
    }

    public List<Album> getAll() {
        return albumRepository.findAll().stream().sorted(Comparator.comparing(Album::getId).thenComparing(Album::getNameAlbum)).collect(Collectors.toList());
    }

    public void update(Long albumtId, Album newAlbumData, Long armyId) {
        Album album = albumRepository.findById(albumtId).get();
        album.setNameAlbum(newAlbumData.getNameAlbum());
        album.setSong(newAlbumData.getSong());
        album.setPrice(newAlbumData.getPrice());
        Army army = armyRepository.findById(armyId).get();
        album.setArmy(army);
        albumRepository.save(album);
    }

    public void delete(Long id) {
        Album album = albumRepository.getById(id);
        album.getArmy().getAlbums().remove(album);
        albumRepository.deleteById(id);
    }
}