package com.melihakkose.methodsandclasses;

public class FootballPlayers {
    //Attribute
    String name;
    String position;
    int age;

    public FootballPlayers(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
        System.out.println("Constructor Called.");
    }
}
