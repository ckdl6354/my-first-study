//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/70128
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i<a.length;i++){ 
        answer += a[i]*b[i];  //a와 b를 곱해 answer에 더해서 누적
        }
        return answer;
    }
}
