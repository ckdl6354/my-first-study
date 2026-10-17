//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181849
class Solution {
    public int solution(String num_str) {
         int answer = 0;
        for(int i =0;i<num_str.length();i++){
         answer += num_str.charAt(i)-'0';
            
        }
        return answer;
    }
}
