package com.example.labwork4final.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "army", schema = "public")
public class Army extends BaseEntity {

    @Column(name = "name_army")
    private String name_army;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "army", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Album> albums = new LinkedList<>();

    public Army() {
    }

    public Army(String nameArmy) {
        this.name_army = nameArmy;
    }

    public String getNameArmy() {
        return name_army;
    }

    public void setNameArmy(String nameArmy) {
        this.name_army = nameArmy;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return toMap().toString();
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name_army", name_army.toString());
        return map;
    }



}
