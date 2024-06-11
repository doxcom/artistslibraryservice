package com.example.artistlibraryservice.repositories;

import com.example.artistlibraryservice.domain.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
