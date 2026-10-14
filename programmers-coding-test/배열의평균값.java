//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120817

class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length;i++){
          sum = sum + numbers[i];
        }
        return  (double)sum / numbers.length;
    }
}
