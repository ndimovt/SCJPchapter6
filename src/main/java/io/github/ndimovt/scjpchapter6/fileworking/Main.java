package io.github.ndimovt.scjpchapter6.fileworking;

import io.github.ndimovt.scjpchapter6.fileworking.FileUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileUtility r = new FileUtility();
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter file name");
        String name = inn.nextLine();
        System.out.println("Choose between numbers, small letters or capital letters");
        String choice = inn.nextLine();
        r.createAndWrite(name,choice);

    }
}