package com.example.artistlibraryservice.bootstrap;

import com.example.artistlibraryservice.domain.Artist;
import com.example.artistlibraryservice.domain.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.artistlibraryservice.repositories.ArtistRepository;
import com.example.artistlibraryservice.repositories.SongRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;

    public BootStrapData(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }
    /*

    5.57 a segundos = 357
    5.57 x 60 = 334.2
    .2 mod 60 =

     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");

        Artist mj = new Artist("Michael Jackson","POP");
        Song thrill = new Song("Thriller",5.57);
        mj.getSongs().add(thrill); //artist linking to a song
        thrill.getArtists().add(mj); //song linking to an artist

        artistRepository.save(mj);
        songRepository.save(thrill);

        //
        Artist rhcp = new Artist("Red hot Chilli Peppers","ROCK");
        Song bicycle = new Song("Bicycle Song",3.40);
        rhcp.getSongs().add(bicycle); //artist linking to a song
        bicycle.getArtists().add(rhcp); //song linking to an artist

        artistRepository.save(rhcp);
        songRepository.save(bicycle);
         //
        Artist bru = new Artist("Bruno Mars","POP");
        Song treasure = new Song("Treasure",2.57);
        bru.getSongs().add(treasure); //artist linking to a song
        treasure.getArtists().add(bru); //song linking to an artist

        artistRepository.save(bru);
        songRepository.save(treasure);

        //
        Artist guns = new Artist("Guns and Roses","ROCK");
        Song nrain = new Song("November Rain",8.56);
        guns.getSongs().add(nrain); //artist linking to a song
        nrain.getArtists().add(guns); //song linking to an artist

        artistRepository.save(guns);
        songRepository.save(nrain);

        // --

        Artist nirv = new Artist("Nirvana","ROCK");
        Song inbloom = new Song("In Bloom",4.15);
        nirv.getSongs().add(inbloom); //artist linking to a song
        inbloom.getArtists().add(nirv); //song linking to an artist

        artistRepository.save(nirv);
        songRepository.save(inbloom);


        System.out.println("Started in bootstrap");
        System.out.println("number of songs: " + songRepository.count());
        System.out.println("artist: " + artistRepository.count());


    }
}
