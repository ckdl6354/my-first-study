//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12903
class Solution {
    public String solution(String s) {
       int mid = s.length()/2; //mid에 s의문자열길이의 2를 나눈수를 넣음
        if(s.length()%2==1){
           return s.substring(mid,mid+1); //mid번째 위치부터 mid+1번째 바로 앞(mid)까지 자름
       }else {
            return s.substring(mid-1,mid+1); //mid -1부터 mid+1번째 앞까지 자름
        }
    }
}
