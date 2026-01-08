package com.example.petshop;
import java.util.Date;


public abstract class Pet {
    private String name;
    private Date birthdate;

    //constructors made with generator from android studio
    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    //getters and setters made with generator from android studio
    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    //returns a string of the noise a pet makes
    public abstract String speak();

}


