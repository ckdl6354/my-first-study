//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120908
class Solution {
    public int solution(String str1, String str2) {
        if(str1.contains(str2)){ // str1 안에 str2가 포함되어 있다면
            return 1;
        }else{
            return 2;    
        }
    }
}
