package io.github.ndimovt.chapter8;

public class Anonimus {
    public void go(){
        System.out.println("From outer");
    }
}
class One{
    Anonimus anonimus = new Anonimus() {
        public void myMethod(){
            System.out.println("from method local inner");
        }
        public void go(){
            System.out.println("from inner, overridden");
        }
    };
    public Anonimus getInstance(){
        return anonimus;
    }

}
