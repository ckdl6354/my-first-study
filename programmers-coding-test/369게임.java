//문제출처: https://school.programmers.co.kr/learn/courses/30/lessons/120891
class Solution {
    public int solution(int order) {
        int count = 0;
        String str = String.valueOf(order); 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);        
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }        
        return count;
    }
}
