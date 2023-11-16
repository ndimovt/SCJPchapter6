package io.github.ndimovt.scjpchapter6.serialization;

import java.io.Serializable;

public class Animal{
    private String name;

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}
