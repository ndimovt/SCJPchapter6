package io.github.ndimovt.chapter8;

public class Main {
    public static void main(String[] args) {
        NestedClass.Inner test = new NestedClass().new Inner();
        test.print();
        Anonimus a = new Anonimus();
        a.go();
        One o = new One();
        Anonimus an = o.getInstance();
        an.go();
        MethodLocal ml = new MethodLocal();
        ml.doSth();

    }
}
