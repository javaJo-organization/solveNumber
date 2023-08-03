package javaJo.calculatorTest;

import java.util.Scanner;

public class Add {
    public static void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int plus = x + y;

        System.out.println("x + y의 값은 " + plus + "입니다");

    }

}