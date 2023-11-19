package io.github.ndimovt.scjpchapter6.datetime;

import java.util.Scanner;

public class Main {
    private static TimeWork tw = new TimeWork();
    private static Scanner inn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1) Get current date, 2)Remove hour 3)Add year 4)Get NewYork time 5) Get Brazil time 6)Get Tokio time");
        int choice = inn.nextInt();
        switch (choice){
            case 1:
                System.out.println(tw.getDate());
                break;
            case 2:
                System.out.println("Enter hours you want to remove: ");
                int remove = inn.nextInt();
                System.out.println(tw.removeHour(remove));
                break;
            case 3:
                System.out.println("Enter years you want to add: ");
                int add = inn.nextInt();
                System.out.println(tw.addYear(add));
                break;
            case 4:
                System.out.println(tw.nyTime());
                break;
            case 5:
                System.out.println(tw.brazilTime());
                break;
            case 6:
                System.out.println(tw.tokyoTime());
                break;
            default:
                break;
        }
    }
}
