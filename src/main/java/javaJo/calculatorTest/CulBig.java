package javaJo.calculatorTest;

import java.util.Scanner;

public class CulBig {
    public static void big() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        System.out.println("x ,y중 큰 값은 " + Math.max(x,y) + "입니다");

    }
}
