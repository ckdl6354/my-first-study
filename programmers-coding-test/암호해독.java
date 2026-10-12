//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120892
class Solution {
    public String solution(String cipher, int code) {
        String answer= "";
        for(int i=0;i<cipher.length();i++){
        if((i+1) % code == 0){
        answer = answer + cipher.charAt(i); //answer에 cipher배열의 문자하나씩 저장
          }
        }
        return answer;
    }
}
