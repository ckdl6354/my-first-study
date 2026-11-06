//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12954
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // long 타입 answer 배열 n의 크기만큼 생성 
        for(int i=0;i<n;i++){ // n만큼 반복
        answer[i] = (long)x*(i+1);  // answer[i]에 long타입 x와 i+1을 곱한 값을 저장
        }
        return answer;
    }
}
