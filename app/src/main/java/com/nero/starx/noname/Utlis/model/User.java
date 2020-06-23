package com.nero.starx.noname.Utlis.model;

public class User {
    private int id;
    private String email, name,grade;

    public User(int id, String email, String name,String grade) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.grade = grade;

    }

    public User(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
