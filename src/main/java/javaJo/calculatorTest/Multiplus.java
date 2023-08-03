package javaJo.calculatorTest;

import java.util.Scanner;

public class Multiplus {
    public static void plus() {

        Scanner sc = new Scanner(System.in);


        // 1부터 시작, x까지의 합, 1씩 증가
        System.out.println("1부터 x까지의 합을 구합니다");
        System.out.println("x의 값을 입력하세요");
        int x = Integer.parseInt(sc.next());

        int sum = 0;

        for ( int i = 1; i <= x; i++ ) {
            sum += sum + i;
        }
        System.out.println("1부터 " + x + "까지의 합은 " + sum + "입니다");

    }
}
