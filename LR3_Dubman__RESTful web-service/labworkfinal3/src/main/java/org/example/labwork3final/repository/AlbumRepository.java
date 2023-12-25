package org.example.labwork3final.repository;

import org.example.labwork3final.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository  extends JpaRepository<Album, Long> {
}
