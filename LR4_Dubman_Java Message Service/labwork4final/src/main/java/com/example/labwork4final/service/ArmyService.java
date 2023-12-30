package com.example.labwork4final.service;

import com.example.labwork4final.jms.Sender;
import com.example.labwork4final.model.*;
import com.example.labwork4final.repository.ArmyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ArmyService {
    @Autowired
    private ArmyRepository armyRepository;

    @Autowired
    private Sender sender;

    public void create(Army army) {
        army.setId(getNextId());
        armyRepository.save(army);
        sender.sendInsert(army);
    }

    public Army get(Long id) {
        return armyRepository.findById(id).get();
    }

    public List<Army> getAll() {
        return armyRepository.findAll().stream().sorted(Comparator.comparing(Army::getId)).collect(Collectors.toList());
    }

    public void update(Long armyId, Army newArmyData) {
        Army army = armyRepository.findById(armyId).get();

        newArmyData.setId(armyId);
        sender.sendUpdate(army, newArmyData);

        army.setNameArmy(newArmyData.getNameArmy());
        armyRepository.save(army);
    }

    public void delete(Long id) {
        Army army = armyRepository.findById(id).get();
        armyRepository.deleteById(id);

        sender.sendDelete(army);
        army.getAlbums().forEach(album -> sender.sendDelete(album));
    }

    public List<Album> getAlbums(Long id) {
        Army army = get(id);
        return army.getAlbums().stream().sorted(Comparator.comparingLong(Album::getId)).collect(Collectors.toList());
    }

    public Long getNextId() {
        long count = armyRepository.count();
        long id = ++count;
        while (armyRepository.existsById(id)) {
            ++id;
        }
        return id;
    }
}
