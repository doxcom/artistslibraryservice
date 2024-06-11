package com.example.artistlibraryservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.artistlibraryservice.repositories.ArtistRepository;

@Controller
public class ArtistController {

    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
       this.artistRepository = artistRepository;
    }

    @RequestMapping("/artists")
    public String getArtist(Model model){
        model.addAttribute("artists", artistRepository.findAll());

        return "artists/list";
    }

}
