package javaJo.calculatorTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Small {
    public static void weak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("비교하고 싶은 첫 번째 숫자를 입력해 주세요.");
        int a = Integer.parseInt(sc.next());

        System.out.println("비교하고 싶은 두 번째 숫자를 입력해 주세요.");
        int b = Integer.parseInt(sc.next());


        if (a > b) {
            System.out.println(b + "가" + a + "보다 작습니다.");
        } else if (a < b) {
            System.out.println(a + "가" + b + "보다 작습니다.");
        } else if (a == b) {
            System.out.println(a + "와" + b + "는 같습니다.");
        }
    }
}
