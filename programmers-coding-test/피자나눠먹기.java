//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120816
class Solution {
    public int solution(int slice, int n) {
        int pizzCnt = 1;
        while(pizzCnt*slice<n ){
            pizzCnt++;
            }
        return pizzCnt;
        }
    }
