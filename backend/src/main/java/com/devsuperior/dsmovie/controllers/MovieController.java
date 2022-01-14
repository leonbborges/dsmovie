package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.DTOs.MovieDTO;
import com.devsuperior.dsmovie.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping

    public Page<MovieDTO> findAll(@PageableDefault(sort = "id", direction = Sort.Direction.ASC, page = 0, size = 12)Pageable pageable){
        return service.findAll(pageable);
    }
    @GetMapping(value = "/{id}")
    public MovieDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
