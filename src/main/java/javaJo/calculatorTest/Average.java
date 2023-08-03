package javaJo.calculatorTest;

import java.util.Scanner;

public class Average {
    public static void ave() {

        Scanner sc = new Scanner(System.in);

        System.out.println("n 값 : ");
        int n = Integer.parseInt(sc.next());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int aver = sum / n;


        System.out.println("1 부터" + n + "까지의 평균은 " + aver + "입니다");

    }
}
