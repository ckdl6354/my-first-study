//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) { //s의 문자 길이가 4도 아니고 6도 아니면 false
            return false;
        }
        for (char str : s.toCharArray()) {  //문자열 s를 문자 배열로 바꾸어 한 글자씩 순서대로 반복해서 str에 담는다
            if (!Character.isDigit(str)) { //str이 숫자가 아니면 false
                return false;
            }
        }
        return true; // 길이 조건과 숫자 조건을 모두 통과하면 true
    }
}
