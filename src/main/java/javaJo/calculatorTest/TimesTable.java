package javaJo.calculatorTest;
import java.util.Scanner;
public class TimesTable {

    public static void timesTable()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력을 원하는 구구단은 몇 단인가요?(숫자만 입력 가능합니다.)");
        int x = sc.nextInt();
        System.out.println("구구단 " + x + "단의 값은 다음과 같습니다.");
        for( int i = 1 ; i < 10 ; ++i ) {
            System.out.println(x + "*" + i + "=" + x * i);
        }
        sc.close();
    }
}
