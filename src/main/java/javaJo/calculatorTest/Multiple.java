package javaJo.calculatorTest;

import java.util.Scanner;

public class Multiple {
    public static void multiple() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int multiple = x * y;

        System.out.println("x * y의 값은 " + multiple + "입니다");
    }
}
