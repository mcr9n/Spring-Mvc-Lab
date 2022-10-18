package com.globallabs.springlabmvc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.globallabs.springlabmvc.model.jedi;
import com.globallabs.springlabmvc.repository.JediRepository;

@RestController
public class JediResource {
    @Autowired
    private JediRepository jediRepository;

    @GetMapping("/api/jedi") //um get nessa api vai me retornar todos os jedi
    public List<jedi> getAllJedi(){
        return JediRepository.findAll();
    }
    @GetMapping("/api/jedi/{id}")
    public jedi getJedi(@PathVariable("id") Long id){
        return JediRepository.findById(id);
    }
    
}