package io.github.ndimovt.scjpchapter6.serialization;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String name = inn.nextLine();
        System.out.println("Enter color: ");
        String color = inn.nextLine();
        Animal a = new Animal(name);
        Cat c = new Cat(a,color);
        Serialize s = new Serialize();
        s.serializeCat(c);
        Deserialize d = new Deserialize();
        d.deserializeCat(c);


    }
}
