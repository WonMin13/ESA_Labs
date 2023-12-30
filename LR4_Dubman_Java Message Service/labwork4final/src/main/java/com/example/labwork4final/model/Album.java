package com.example.labwork4final.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "album", schema = "public")
public class Album extends BaseEntity {

    private String name_album;

    private String song;

    private Integer price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "army_id")
    private Army army;

    public Album() {
    }

    public Album(String nameAlbum, String song, Integer price) {
        this.name_album = nameAlbum;
        this.song = song;
        this.price = price;
    }

    public Album(String nameAlbum, String song, Integer price, Army army) {
        this.name_album = nameAlbum;
        this.song = song;
        this.price = price;
        this.army = army;
    }

    public String getNameAlbum() {
        return name_album;
    }

    public void setNameAlbum(String nameAlbum) {
        this.name_album = nameAlbum;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    @Override
    public String toString() {
        return toMap().toString();
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name_album", name_album);
        map.put("song", song);
        map.put("price", price.toString());
        map.put("armyId", army.getId().toString());
        return map;
    }
}
