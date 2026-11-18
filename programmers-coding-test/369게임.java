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
//List를 이용한 풀이
import java.util.*;
class Solution2 {
    public int solution(int order) {
        List<Character> clapList = Arrays.asList('3', '6', '9');
        int cnt = 0;
        String str = String.valueOf(order);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (clapList.contains(c)) {
                cnt++;
            }
        }
        return cnt;
    }
} 
//Map을 이용한 풀이
import java.util.*;
class Solution2 {
    public int solution(int order) {
        String str = String.valueOf(order);
    Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
        }
        return map.getOrDefault('3',0)+map.getOrDefault('6',0)+map.getOrDefault('9',0);
    }
}












