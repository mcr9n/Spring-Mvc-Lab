package com.globallabs.springlabmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.globallabs.springlabmvc.model.jedi;

@Repository
public class JediRepository {
    final static List<jedi> Jedi  = new ArrayList<>();

    public JediRepository() {
        Jedi.add(new jedi("Luke", "Skywalker"));
    }

    public List<jedi> getAllJedi(){
        return this.Jedi;
    }
    public String add(jedi jedi){
        Jedi.add(jedi);
        jedi.setId((long) (Jedi.size() - 1));
        return "redirect:jedi";
    }

    public static List<jedi> findAll() {
        return Jedi;
    }

    public static jedi findById(Long id) {
        return Jedi.get(id.intValue());
    }
}