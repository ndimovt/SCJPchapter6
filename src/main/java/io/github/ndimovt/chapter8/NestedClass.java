package io.github.ndimovt.chapter8;

public class NestedClass {
    private int count = 10;
    class Inner{
        void print(){
            System.out.println("Count is "+count);
        }
    }
}
