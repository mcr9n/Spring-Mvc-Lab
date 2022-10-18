package com.globallabs.springlabmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.globallabs.springlabmvc.model.jedi;
import com.globallabs.springlabmvc.repository.JediRepository;

@Controller
public class jediController {
    @Autowired
    private JediRepository repository;



    @GetMapping("/jedi")
    public ModelAndView jedi(){
        final ModelAndView modelAndView = new ModelAndView(); // Instantiating view
        modelAndView.setViewName("jedi"); // Setting view
        modelAndView.addObject("allJedi", repository.getAllJedi()); // Setting data
        return modelAndView ;
    }
    @GetMapping("/new-jedi")
    public ModelAndView newJedi(){
        final ModelAndView modelAndView = new ModelAndView(); //new view
        modelAndView.setViewName("new-jedi");
        modelAndView.addObject("jedi", new jedi());   // new form
        return modelAndView; 
    }
    @PostMapping("/jedi")
    public String createJedi(@Validated @ModelAttribute jedi Jedi, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "new-jedi";
        }
        repository.add(Jedi);
        redirectAttributes.addFlashAttribute("message","Jedi cadastrado com sucesso"); // message green
        return "redirect:jedi";
    }

    
}