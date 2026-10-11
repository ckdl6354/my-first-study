//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181838

class Solution {
    public int solution(int[] date1, int[] date2) {
    int num1 = date1[0]*10000+date1[1]*100+date1[2];
    int num2 = date2[0]*10000+date2[1]*100+date2[2];
        return num1 < num2 ? 1:0;
    }
}
