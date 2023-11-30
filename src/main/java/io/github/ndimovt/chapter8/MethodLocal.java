package io.github.ndimovt.chapter8;

public class MethodLocal {
    private String word = "Hello";
    public void doSth(){
        final String secondWord = " World";
        class Test {
            public void print(){
                System.out.println(word + secondWord);
            }
        }
        Test test = new Test();
        test.print();
    }
}
