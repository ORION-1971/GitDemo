package com.gitdemo;

public class User {
    private int id;

    private String name;

    private int age;

    public User(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
