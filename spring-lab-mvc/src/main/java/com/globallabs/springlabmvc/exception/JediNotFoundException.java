package com.globallabs.springlabmvc.exception;

public class JediNotFoundException extends RuntimeException {
    
    public JediNotFoundException(){
        super("Jedi not Found!");
    }

}


