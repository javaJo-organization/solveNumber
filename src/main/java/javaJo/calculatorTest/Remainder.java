package javaJo.calculatorTest;

import java.util.Scanner;

public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}
