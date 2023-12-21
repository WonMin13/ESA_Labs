package org.example.labwork1final.dao;

import org.example.labwork1final.model.Army;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ArmyDao {

    public void create(Army army) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(army);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Army get(Long id) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Army army = entityManager.find(Army.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();
        return army;
    }

    public List<Army> getAll() {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        List<Army> armys = entityManager.createQuery("select e from Army e", Army.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return armys;
    }

    public void update(Long id, Army newArmyData) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Army army = entityManager.find(Army.class, id);
        if (army != null) {
            army.setNameArmy(newArmyData.getNameArmy());
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Long id) {
        EntityManager entityManager = DaoUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Army army = entityManager.find(Army.class, id);
        if (army != null) {
            entityManager.remove(army);
        }
        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
