package org.example.labwork2final.repository;

import org.example.labwork2final.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository  extends JpaRepository<Album, Long> {
}

