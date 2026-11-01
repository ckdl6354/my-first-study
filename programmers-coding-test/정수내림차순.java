//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12933
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n); //문자형 str에 n을 넣는다.
        String[] arr = str.split(""); 
      //문자열 str을 한글자씩 쪼개서 문자열 배열 arr에 나눠 담는다.
        
        Arrays.sort(arr, Collections.reverseOrder()); // arr의 배열 내림차순으로 정렬
         
        String result = String.join("", arr); // arr안에 문자를 길게 이어 붙임
        return Long.parseLong(result); // 문자형 result를 Long타입으로 변환
    }
}
