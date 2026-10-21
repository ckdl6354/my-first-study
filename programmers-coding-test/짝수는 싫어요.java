//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120813
class Solution {
    public int[] solution(int n) {
        int [] odd = new int [(n+1)/2];
        int index =0; //배열의 번호를 가르킬 변수
        for(int i=0;i<=n;i++){
            if(i %2 != 0) {
                odd[index] = i; //index에 홀 수 저장
                index++; //index의 숫자 1 증가
            }  
        }
        return odd;
    }
}
