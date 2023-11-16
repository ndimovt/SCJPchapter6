package io.github.ndimovt.scjpchapter6.serialization;

import java.io.*;

public class Cat extends Animal implements Serializable {
    transient private Animal theAnimal;
    private String color;

    public Cat( Animal animal, String color) {
        this.theAnimal = animal;
        this.color = color;
    }
    public Animal getTheAnimal(){
        return theAnimal;
    }
    private void writeObject(ObjectOutputStream ous) {
        try{
            ous.defaultWriteObject();
            ous.writeChars(theAnimal.getName());
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            theAnimal = new Animal(ois.readLine());
        }catch (ClassNotFoundException cfne){
            cfne.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return theAnimal +" color= " + color;
    }
}
