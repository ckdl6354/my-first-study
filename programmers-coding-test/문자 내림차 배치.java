//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12917
import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(); //문자열 수정,뒤집을 빈 객체 sb생성
        char[] str = s.toCharArray(); //문자열 s를 한글자씩 나눠서 char[]배열의 str에저장
        Arrays.sort(str); //str안에있는 요소들을 오름차순으로 정렬
        sb.append(str); // 오름차순으로 정렬된 문자배열str을 sb에 이어붙임
        sb.reverse(); //sb에있는 문자열들 위치를 거꾸로 바꿈
        return sb.toString(); //sb를 일반 String 문자열로 변환후 반환
        }
    }
