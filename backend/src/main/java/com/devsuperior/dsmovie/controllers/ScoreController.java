package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.DTOs.MovieDTO;
import com.devsuperior.dsmovie.DTOs.ScoreDTO;
import com.devsuperior.dsmovie.Services.ScoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    @Autowired
    private ScoreServices services;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        return services.saveScore(dto);
    }
}
