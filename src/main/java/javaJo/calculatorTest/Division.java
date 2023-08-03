package javaJo.calculatorTest;

import java.util.Scanner;

public class Division {
    public static void div() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int division = x / y;

        System.out.println("x ÷ y의 값은 " + division + "입니다");


    }
}
