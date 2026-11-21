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

//문제 : 음양더하기 leve1
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]==true){ //signs가 true면 absolutes의 i번째 값을 누적해서 더함
                sum += absolutes[i];
            }else{ //signs가 false면 absolutes의 i번째 값을 뺌
                sum-=absolutes[i];
            }
        }
        return sum;
    }
}
