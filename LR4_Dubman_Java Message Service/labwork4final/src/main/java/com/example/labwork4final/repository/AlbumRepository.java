package com.example.labwork4final.repository;

import com.example.labwork4final.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
