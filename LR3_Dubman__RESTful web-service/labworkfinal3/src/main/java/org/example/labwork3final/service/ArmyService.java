package org.example.labwork3final.service;

import org.example.labwork3final.model.*;
import org.example.labwork3final.repository.ArmyRepository;
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

    public void create(Army army) {
        armyRepository.save(army);
    }

    public Army get(Long id) {
        return armyRepository.findById(id).get();
    }

    public List<Army> getAll() {
        return armyRepository.findAll().stream().sorted(Comparator.comparing(Army::getId)).collect(Collectors.toList());
    }

    public void update(Long armyId, Army newArmyData) {
        Army army = armyRepository.findById(armyId).get();
        army.setNameArmy(newArmyData.getNameArmy());
        armyRepository.save(army);
    }

    public void delete(Long id) {
        armyRepository.deleteById(id);
    }

    public List<Album> getAlbums(Long id) {
        Army army = get(id);
        return army.getAlbums().stream().sorted(Comparator.comparing(Album::getId).thenComparing(Album::getNameAlbum)).collect(Collectors.toList());
    }

}
