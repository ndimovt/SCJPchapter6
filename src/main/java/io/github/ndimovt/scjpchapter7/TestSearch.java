package io.github.ndimovt.scjpchapter7;

public class TestSearch {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name +"/"+ age;
    }

    public TestSearch(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
