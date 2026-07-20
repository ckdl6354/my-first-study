public class Gugudan {
    public static void main(String[] args) {
        System.out.println("구구단 (1단 ~ 9단) ★\n");

        for (int i = 1; i <= 9; i++) {
            System.out.println("--- " + i + "단 ---");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

/*
#  이중 반복문 구구단 프로그램
- 자바의 중첩 포문(Nested for-loop)을 활용하여 1단부터 9단까지 출력하는 기초 예제입니다.
## 주요 기능
- 외부 `for`문으로 1단부터 9단까지 반복
- 내부 `for`문으로 각 단의 1부터 9까지 곱셈 연산 처리
*/

