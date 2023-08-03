package javaJo.calculatorTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. 더하기");
            System.out.println("2. 뻬기");
            System.out.println("3. 나누기");
            System.out.println("4. 곱하기");
            System.out.println("5. 나머지");
            System.out.println("6. 1에서 n까지 합");
            System.out.println("7. n 구구단");
            System.out.println("8. 1에서 n의 평균");
            System.out.println("9. x 와 y 중 큰 수");
            System.out.println("10. x 와 y 중 작은 수");
            System.out.println("0. 종료");
            System.out.println("번호를 입력하세요 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1: Add.add(); break;
                case 2: CulSub.subtract(); break;
                case 3: Division.div(); break;
                case 4: Multiple.multiple(); break;
                case 5: Remainder.mod(); break;
                case 6: Multiplus.multiplus(); break;
                case 7:TimesTable.timesTable(); break;
                case 8: Average.ave(); break;
                case 9: CulBig.big(); break;
                case 10:Small.weak(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;

            }

        } while (true);

    }
}
