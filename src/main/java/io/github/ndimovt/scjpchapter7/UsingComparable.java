package io.github.ndimovt.scjpchapter7;

import java.util.Comparator;

public class UsingComparable implements Comparable<UsingComparable> {
    //this class is all about me implementing compareTo()
    //objects created from this class are movies
    private String name;
    private int year;
    private String authorName;
    private String genre;

    public UsingComparable(String name, int year, String authorName, String genre) {
        this.name = name;
        this.year = year;
        this.authorName = authorName;
        this.genre = genre;
    }
    public int compareTo(UsingComparable uc){
        return name.compareTo(uc.getName());
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "UsingComparable{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
