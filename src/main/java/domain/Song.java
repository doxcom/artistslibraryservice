package domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int duration;

    public Song() {

    }
    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
