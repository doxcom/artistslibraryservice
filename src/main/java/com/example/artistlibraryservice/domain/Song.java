package com.example.artistlibraryservice.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Double duration;

    public Song() {

    }
    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    @ManyToMany
    @JoinTable(name="artist_song", joinColumns = @JoinColumn(name="song_id"),
            inverseJoinColumns = @JoinColumn(name="artist_id"))

    private Set<Artist> artists = new HashSet<>();


    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;
        return id.equals(song.id) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
