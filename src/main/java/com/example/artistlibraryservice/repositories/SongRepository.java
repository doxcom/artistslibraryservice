package com.example.artistlibraryservice.repositories;

import com.example.artistlibraryservice.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
