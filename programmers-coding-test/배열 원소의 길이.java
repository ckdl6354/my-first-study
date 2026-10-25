//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120854
class Solution {
    public int[] solution(String[] strlist) {
        int [] num = new int[strlist.length]; //strlist와 동일한 갯수 배열 생성 
        for(int i=0;i<strlist.length;i++){
            num[i] = strlist[i].length(); // num[i] 배열에 strlist[i] 문자열길이 숫자 대입
        }
        return num;
    }
}
