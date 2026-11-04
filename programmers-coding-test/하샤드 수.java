//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12947
class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int originalX = x;
        while(x > 0){  // x가 0보다 클동안 반복
         sum += x % 10;  // x의 10으로 나눈 나머지를 sum에 누적
             x /= 10; //x를 10으로 나눈 몫만 남겨서 x에 대입
        }
        return originalX % sum == 0; 
        //originalX가 sum이랑 나눳을때 나머지가 0인지 확인 (true,false) 반환
    }
}
