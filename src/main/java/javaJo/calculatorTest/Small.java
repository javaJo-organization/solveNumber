package javaJo.calculatorTest;

import java.util.Scanner;

public class Small {
    public static void weak() {
            Scanner sc = new Scanner(System.in);
            String a,b;
            System.out.println("비교하고 싶은 첫 번째 숫자를 입력해 주세요.");
            a = sc.nextLine();

            System.out.println("비교하고 싶은 두 번째 숫자를 입력해 주세요.");
            b = sc.nextLine();

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);

        if(x>y) System.out.println(">");
        else if(x<y) System.out.println("<");
        else System.out.println("==");
    }
}
