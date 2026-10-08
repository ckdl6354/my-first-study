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
