//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120585
class Solution {
    public int solution(int[] array, int height) {
        int answer =0;   
        for(int list : array){   //list에 array배열을 담음
            if(height<list){
                answer++;   //키 큰 사람의 숫자를 카운트
            }
        }
        return answer;
    }
}
