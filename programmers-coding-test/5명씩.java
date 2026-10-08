//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181886
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {      
         ArrayList<String> list = new ArrayList<>();
        
        for(int i =0;i<names.length;i+=5){
            list.add(names[i]);
        }
        return list.toArray(new String[0]);
    }
}

// 문제 다른풀이
class Solution {
    public String[] solution(String[] names) {
        
        int size = (names.length % 5 == 0) ? (names.length / 5) : (names.length / 5 + 1);
        String[] answer = new String[size];

        int index = 0;
        for (int i = 0; i < names.length; i += 5) {
            answer[index] = names[i];
            index++;
        }
        
        return answer;
    }
}
