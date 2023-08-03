package javaJo.calculatorTest;

import java.util.Scanner;

public class CulSub {
    public static void subtract() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int minus = x - y;

        System.out.println("x - y의 값은 " + minus + "입니다");


    }
}
