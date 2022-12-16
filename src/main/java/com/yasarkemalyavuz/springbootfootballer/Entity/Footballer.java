package com.yasarkemalyavuz.springbootfootballer.Entity;

public class Footballer {

    private int id;

    private int age;

    private String name;

    private String team;


    public Footballer(int id, int age, String name, String team) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
