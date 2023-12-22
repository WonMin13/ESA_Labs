package org.example.labwork2final.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "_army")
public class Army {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator",  sequenceName = "_army_id_seq", allocationSize = 1)
    private Long id;

    private String nameArmy;

    @OneToMany(mappedBy = "army", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Album> albums = new HashSet<>();

    public Army() {
    }

    public Army(String nameArmy) {
        this.nameArmy = nameArmy;
    }

    public Army(String nameArmy, Set<Album> albums) {
        this.nameArmy = nameArmy;
        this.albums = albums;
    }

    public Long getId() {
        return id;
    }

    public String getNameArmy() {
        return nameArmy;
    }

    public void setNameArmy(String nameArmy) {
        this.nameArmy = nameArmy;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
