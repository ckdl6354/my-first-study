//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12912
class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if (a < b) {
            for(int i=a;i<=b;i++){ //a부터 시작해 b까지 반복하는 반복문
                sum += i;  //i를 증가시킨 숫자를 sum에 순서대로 대입
            }
        } else {
            for (int i = b; i <= a; i++) {  //b부터 시작해 a까지 반복
                sum += i;  //i를 증가시킨 숫자를 sum에 대입
            }
        }
        return sum; //sum에 들어간 숫자(int)반환
    }
}
