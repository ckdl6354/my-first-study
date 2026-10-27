//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120909
class Solution {
    public int solution(int n) {
        int root = (int)(Math.sqrt(n)); //Math.sqrt(n)으로 n의 제곱근(루트값)을 구함(결과는 double 타입이라 int로 형변환(Casting)
        if(root*root== n){ // 만약 root제곱이 n과 같다면
            return 1;
        }else{
            return 2;
        }
    }
}
