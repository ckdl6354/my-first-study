//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12934
class Solution {
    public long solution(long n) { 
        double x = Math.sqrt(n); //n에 루트(제곱근)을 씌움, (double)x에는 11.0이 저장
        if(x==(long)x){ // x = 11.0 이 (long)x = 11 같은지 확인
            return (long)Math.pow(x+1,2); //맞으면 x에 +1을 더한 2제곱 (long)x반환
        }else{
            return -1;
        }
    }
}
