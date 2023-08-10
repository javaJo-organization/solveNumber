# FIRST 협업 프로젝트 : 자바 기초 연산 계산기 만들기!

## 📈 팀장: 배승수 <br/>
### 맡은 부분 : <br/>
<p>
 
 1. 프로젝트 생성 및 디렉토리 구조 설정 <br/> 
 ![01_파일 구조](https://github.com/javaJo-organization/solveNumber/assets/132265893/bb0331fc-619e-4727-8a37-a1c09afe6274) 


 
 3. Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성 </br>
<details>
<summary>Main 로직 보기</summary>
<div markdown="1">

 ```
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
```
</div>
</details>
 
3. Git Repository 생성 후, push 해서 팀원들이 clone 할 수 있게 했고, 팀원들의 Pull Request을 체크하고 merge </br>
4. 나머지(Reminder)와 평균(Average)를 구하는 로직 구성<br/>
<details>
<summary>나머지 로직 보기</summary>
<div markdown="1">

```
public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}

```

</div>
</details>


<details>
<summary>평균 로직 보기</summary>
<div markdown="1">

```
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
```

</div>
</details>

   
5. git branch 생성 및 pull/commit/push 반복 진행
</p>
<br/>

## 박순철 <br/>
### 맡은 부분 : <br/>
<p>
 1. 프로젝트 생성 및 디렉토리 구조 설정 <br/>
 ![image](https://github.com/javaJo-organization/solveNumber/assets/132265893/f8d731de-8ce7-4783-b4ea-7b37643cd48f)
 2. Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성 </br>
<details>
<summary>Main 로직 보기</summary>
<div markdown="1">

 ```
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
```
</div>
</details>
 
3. Git Repository 생성 후, push 해서 팀원들이 clone 할 수 있게 했고, 팀원들의 Pull Request을 체크하고 merge </br>
4. 나머지(Reminder)와 평균(Average)를 구하는 로직 구성<br/>
<details>
<summary>나머지 로직 보기</summary>
<div markdown="1">

```
public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}

```

</div>
</details>


<details>
<summary>평균 로직 보기</summary>
<div markdown="1">

```
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
```

</div>
</details>

   
5. git branch 생성 및 pull/commit/push 반복 진행
</p>
<br/>


## 김민주 <br/>
### 맡은 부분 : <br/>
<p>
 1. 프로젝트 생성 및 디렉토리 구조 설정 <br/>
 ![image](https://github.com/javaJo-organization/solveNumber/assets/132265893/f8d731de-8ce7-4783-b4ea-7b37643cd48f)
 2. Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성 </br>
<details>
<summary>Main 로직 보기</summary>
<div markdown="1">

 ```
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
```
</div>
</details>
 
3. Git Repository 생성 후, push 해서 팀원들이 clone 할 수 있게 했고, 팀원들의 Pull Request을 체크하고 merge </br>
4. 나머지(Reminder)와 평균(Average)를 구하는 로직 구성<br/>
<details>
<summary>나머지 로직 보기</summary>
<div markdown="1">

```
public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}

```

</div>
</details>


<details>
<summary>평균 로직 보기</summary>
<div markdown="1">

```
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
```

</div>
</details>

   
5. git branch 생성 및 pull/commit/push 반복 진행
</p>

## 김민범 <br/>
### 맡은 부분 : <br/>
<p>
 1. 프로젝트 생성 및 디렉토리 구조 설정 <br/>
 ![image](https://github.com/javaJo-organization/solveNumber/assets/132265893/f8d731de-8ce7-4783-b4ea-7b37643cd48f)
 2. Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성 </br>
<details>
<summary>Main 로직 보기</summary>
<div markdown="1">

 ```
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
```
</div>
</details>
 
3. Git Repository 생성 후, push 해서 팀원들이 clone 할 수 있게 했고, 팀원들의 Pull Request을 체크하고 merge </br>
4. 나머지(Reminder)와 평균(Average)를 구하는 로직 구성<br/>
<details>
<summary>나머지 로직 보기</summary>
<div markdown="1">

```
public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}

```

</div>
</details>


<details>
<summary>평균 로직 보기</summary>
<div markdown="1">

```
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
```

</div>
</details>

   
5. git branch 생성 및 pull/commit/push 반복 진행
</p>

## 이가현 <br/>
### 맡은 부분 : <br/>
<p>
 1. 프로젝트 생성 및 디렉토리 구조 설정 <br/>
 ![image](https://github.com/javaJo-organization/solveNumber/assets/132265893/f8d731de-8ce7-4783-b4ea-7b37643cd48f)
 2. Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성 </br>
<details>
<summary>Main 로직 보기</summary>
<div markdown="1">

 ```
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
```
</div>
</details>
 
3. Git Repository 생성 후, push 해서 팀원들이 clone 할 수 있게 했고, 팀원들의 Pull Request을 체크하고 merge </br>
4. 나머지(Reminder)와 평균(Average)를 구하는 로직 구성<br/>
<details>
<summary>나머지 로직 보기</summary>
<div markdown="1">

```
public class Remainder {
    public static void mod() {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("y 값 : ");
        int y = Integer.parseInt(sc.next());

        int remainder = x % y;

        System.out.println("x / y의 나머지는 " + remainder + "입니다");

    }
}

```

</div>
</details>


<details>
<summary>평균 로직 보기</summary>
<div markdown="1">

```
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
```

</div>
</details>

   
5. git branch 생성 및 pull/commit/push 반복 진행
</p>

 ## 화이팅!!!!
