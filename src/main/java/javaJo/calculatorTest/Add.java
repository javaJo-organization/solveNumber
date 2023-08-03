package javaJo.calculatorTest;

import java.util.Scanner;

public class Add {
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int x = sc.nextInt();
        System.out.println("숫자를 입력하세요.");
        int y = sc.nextInt();
        System.out.println(x+y);
        sc.close();
    }

}