//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/86051
class Solution {
    public int solution(int[] numbers) {
        int sum = 45; //0부터 9까지 다 더한 기준점(45)
        for(int num : numbers){ //int num을 numbers로 하나씩 꺼내서 sum을 뺌
            sum -=num;
        }
        return sum;
    }
}
