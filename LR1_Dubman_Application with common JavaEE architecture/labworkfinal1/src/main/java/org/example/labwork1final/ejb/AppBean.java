package org.example.labwork1final.ejb;

import org.example.labwork1final.dao.*;
import org.example.labwork1final.model.*;

import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class AppBean {

    private final ArmyDao armyDao = new ArmyDao();
    private final AlbumDao albumDao = new AlbumDao();

    public void createArmy(Army army) {
        armyDao.create(army);
    }

    public void createAlbum(Album album, Long groupId) {
        Army army = armyDao.get(groupId);
        if ( army == null)
            return;
        album.setArmy(army);
        albumDao.create(album);
    }

    public List<Army> getAllArmys() {
        return armyDao.getAll();
    }

    public Army getArmyById(Long id) {
        return armyDao.get(id);
    }

    public List<Album> getAllAlbums() {
        return albumDao.getAll();
    }

    public Album getAlbumById(Long id) {
        return albumDao.get(id);
    }

    public void updateArmy(Long armyId, Army newArmyData) {
        armyDao.update(armyId, newArmyData);
    }

    public void updateAlbum(Long albumId, Album newAlbumData, Long armyId) {
        Army army = armyDao.get(armyId);
        if (army == null)
            return;
        newAlbumData.setArmy(army);
        albumDao.update(albumId, newAlbumData);
    }

    public void deleteArmy(Long armyId) {
        Army army = getArmyById(armyId);
        if (army == null)
            return;
        army.getAlbums().forEach(album -> this.deleteAlbum(album.getId()));
        DaoUtil.refresh();
        armyDao.delete(armyId);
    }

    public void deleteAlbum(Long albumId) {
        albumDao.delete(albumId);
    }


}
