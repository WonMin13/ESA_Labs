package org.example.labwork1final.dao;

import org.example.labwork1final.model.Album;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AlbumDao {

    public void create(Album album) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(album);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Album get(Long id) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Album album = entityManager.find(Album.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();
        return album;
    }

    public List<Album> getAll() {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        List<Album> albums = entityManager.createQuery("select g from Album g", Album.class).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        return albums;
    }

    public void update(Long id, Album newAlbumData) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Album album = entityManager.find(Album.class, id);
        if (album != null) {
            album.setNameAlbum(newAlbumData.getNameAlbum());
            album.setSong(newAlbumData.getSong());
            album.setPrice(newAlbumData.getPrice());
            album.setArmy(newAlbumData.getArmy());
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Long id) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Album album = entityManager.find(Album.class, id);
        if (album != null) {
            entityManager.remove(album);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
