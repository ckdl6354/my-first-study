//문제링크:https://school.programmers.co.kr/learn/courses/30/lessons/181944

import java.util.Scanner;

public class 홀짝 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if(n%2==0) {
    	System.out.println(n+" is even");
    }else if(n%3==1) {
    	System.out.println(n+" is odd");
    }
    }
}
