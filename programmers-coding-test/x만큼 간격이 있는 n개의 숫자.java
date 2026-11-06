//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12954
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
        answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}
