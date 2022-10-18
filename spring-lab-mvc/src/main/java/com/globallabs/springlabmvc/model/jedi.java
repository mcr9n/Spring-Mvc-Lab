package com.globallabs.springlabmvc.model;

import org.springframework.lang.NonNull;

public class jedi {
    private Long id;
    @NonNull
    private String lastName;
    @NonNull
    private String name;

    public jedi() {
    }
    
    public jedi(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long l) {
        this.id = l;
        
    }

    public Long getId() {
        return this.id;
    }



}
