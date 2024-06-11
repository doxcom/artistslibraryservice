package com.example.artistlibraryservice.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.artistlibraryservice.repositories.SongRepository;

@Controller
public class SongController {

  private SongRepository songRepository;

  public SongController(SongRepository songRepository) {

      this.songRepository = songRepository;
  }

  @RequestMapping("/songs")
  public String getSongs(Model model){
      model.addAttribute("songs", songRepository.findAll());
      return "songs/list"; //look for the template thymeleaf
  }
}
