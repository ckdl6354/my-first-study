//문제링크 https://school.programmers.co.kr/learn/courses/30/lessons/181936

class 공배수.java {
    public int solution(int number, int n, int m) {
        if(number%n==0 && number%m  == 0 ){
            return 1;
        }else
            return 0;    
    }
}
