//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/87389
class Solution {
    public int solution(int n) {
        int x = 2; // x값을 2로초기화
        while(n%x!=1){  //n을 x(2)로 나눳을때 1아닐때까지 반복 
            x++; //x 1증가
        }
        return x;
    }
}
