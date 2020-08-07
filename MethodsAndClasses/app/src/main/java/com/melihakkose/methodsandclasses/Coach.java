package com.melihakkose.methodsandclasses;

public class Coach {
    String name;
    int age;
    String country;
    protected String team ;
    private int salary;
    private int id;
    private int achievements;

    public Coach(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.team="Liverpool";

    }
    //GETTER & SETTER FOR PRIVATE ATTRIBUTE

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAchievements() {
        return achievements;
    }

    public void setAchievements(int achievements) {
        this.achievements = achievements;
    }
}
