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


class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(); //문자열 담을 sb생성
        for (char c : my_string.toCharArray()) { // my_string을 문자 배열로 쪼개 한 글자씩 c에 담아 반복
            sb.append(c);  //sb에 현재 문자 한 개를 기본으로 추가
            if (c >= 'A' && c <= 'Z') {  // c가 대문자 'A' 이상이고 'Z' 이하이면 (즉, 영어 대문자이면)
                sb.append(c); // 대문자이므로 한 번 더 추가
            }
        }
        
        return sb.toString();
    }
}
