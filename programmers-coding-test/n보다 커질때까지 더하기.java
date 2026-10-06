//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181884
class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
           sum +=numbers[i];
            if(sum>n){
             return sum;
            }
        }
         return sum;
    }
}
