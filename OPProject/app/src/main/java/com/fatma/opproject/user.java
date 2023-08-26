package com.fatma.opproject;

public class user extends People{
    String name;
    String job;

    public user(String nameInput,String jobInput){
        this.name=nameInput;
        this.job=jobInput;
        System.out.println("User Created");
    }

}
