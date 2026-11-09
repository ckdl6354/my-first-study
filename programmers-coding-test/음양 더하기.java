//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/76501
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i=0;i<absolutes.length;i++){ //반복문으로 absolutes길이만큼 반복
            if(signs[i]){ //signs[i]가 true면 sum에absolutes를 더함
            sum += absolutes[i];
        }else{  ////signs[i]가 false면 sum에absolutes를 뺌
            sum -= absolutes[i];
            }
        }
        return sum;
    }
}

//번외 : sum += signs[i] ? absolutes[i] : -absolutes[i]; 한줄로 가능
