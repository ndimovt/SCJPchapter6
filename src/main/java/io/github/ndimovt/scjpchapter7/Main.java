package io.github.ndimovt.scjpchapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testUsingComparable();
        System.out.println();
        testComparator();


    }
    private static void equalsTesting(){
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
    private static void testUsingComparable(){
        UsingComparable uc = new UsingComparable("Whirlwind",1989,"James Clavel","drama");
        UsingComparable uc1 = new UsingComparable("Abc", 2008,"Richard Knaak","sci-fi");
        UsingComparable uc2 = new UsingComparable("Illidan",2018,"Willian King","sci-fi");
        List<UsingComparable> test = new ArrayList<>();
        test.add(uc);
        test.add(uc1);
        test.add(uc2);
        Collections.sort(test);
        for(UsingComparable movie : test){
            System.out.println(movie);
        }
    }
    private static void testComparator(){
        TestSearch ts0= new TestSearch("Petko",20);
        TestSearch ts1 = new TestSearch("Asen",40);
        TestSearch ts2= new TestSearch("Ivan",19);
        TestSearch ts3 = new TestSearch("Georgi",33);
        Object[] data = {ts0,ts1,ts2,ts3};
        System.out.println("Unsorted: ");
        for(Object result : data){
            System.out.println(result);
        }
        System.out.println();
        Comparing comp = new Comparing();
        Arrays.sort(data,comp);
        for(Object sortResult : data){
            System.out.println(sortResult);
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(data, new TestSearch("ivan",19), comp));


    }
}
