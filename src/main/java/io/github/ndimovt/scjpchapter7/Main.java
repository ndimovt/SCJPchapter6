package io.github.ndimovt.scjpchapter7;

public class Main {
    public static void main(String[] args) {
        EqualsHashcodeTest eqt = new EqualsHashcodeTest(13,"Ivan");
        EqualsHashcodeTest qgt1 = new EqualsHashcodeTest(13,"Dragan");
        EqualsHashcodeTest eqt2 = new EqualsHashcodeTest(13,"Petko");
        System.out.println(eqt.equals(qgt1));
        System.out.println(qgt1.equals(eqt2));
        System.out.println(eqt.equals(eqt2));
        System.out.println(eqt.hashCode());
        System.out.println(qgt1.hashCode());
        System.out.println(eqt2.hashCode());

    }
}
