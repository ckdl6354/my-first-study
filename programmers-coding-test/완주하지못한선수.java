//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/42576
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> list = new HashMap<>(); // 문자(key)와 숫자(value)
        
        for (int i = 0; i < participant.length; i++) {
            list.put(participant[i], list.getOrDefault(participant[i], 0) + 1); 
           //list에서 이름을 찾아 기존 숫자에 1을 더한다.(list에 아직 없는 이름이면 0에서 시작해 1을더함)
        }
        
        for (int i = 0; i < completion.length; i++) {
            list.put(completion[i], list.get(completion[i]) - 1); //list에서 completion에 같은 이름을 찾아 -1을 뺀다.
        }
        
        for (String key : list.keySet()) { //list.keySet()은 위에서부터 하나씩 꺼내보기 
            if (list.get(key) != 0) { //key(value)가 0이 아니면(즉,1이면) key(이름)를 반환
                return key;
            }
        }
        
        return "";
    }
}
