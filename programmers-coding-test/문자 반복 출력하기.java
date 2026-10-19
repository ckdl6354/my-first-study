//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120825
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();   
        for(char c : my_string.toCharArray()){   //.toCharArray()를 붙여 글자배열로 쪼갠다.
            for(int i=0;i<n;i++){
                sb.append(c); //반복이 돌때마다 sb에 내용을 추가
            }
        }
        return sb.toString();
    }
}
