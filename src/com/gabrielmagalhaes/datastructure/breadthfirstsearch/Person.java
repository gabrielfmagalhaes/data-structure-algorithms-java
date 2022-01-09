package com.gabrielmagalhaes.datastructure.breadthfirstsearch;

public class Person {
    private String name;
    private String musicalGenre;

    public Person(String name, String musicalGenre) {
        this.name = name;
        this.musicalGenre = musicalGenre;
    }

    public String getName() {
        return name;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    @Override
    public String toString() {
        return "Person name: " + this.name;
    }
}
