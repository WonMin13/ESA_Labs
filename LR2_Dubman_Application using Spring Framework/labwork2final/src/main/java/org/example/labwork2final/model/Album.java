package org.example.labwork2final.model;

import javax.persistence.*;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator",  sequenceName = "album_id_seq", allocationSize = 1)
    private Long id;

    private String nameAlbum;

    private String song;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "army_id")
    private Army army;

    public Album() {
    }

    public Album(String nameAlbum, String song, Integer price) {
        this.nameAlbum = nameAlbum;
        this.song = song;
        this.price = price;
    }

    public Album(String nameAlbum, String song, Integer price, Army army) {
        this.nameAlbum = nameAlbum;
        this.song = song;
        this.price = price;
        this.army = army;
    }

    public Long getId() {
        return id;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
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
}
