//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12935
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); 
        int min = arr[0]; 
        for (int num : arr) {
            min = Math.min(min, num); // min보다 num이작으면 min에 대입
        }
        for (int num : arr) {
            if (min != num) { //min과 num이 같지않으면 list에 num을 추가
                list.add(num);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1}; //list가 비어있으면 int배열 -1반환
        }
        return list.stream().mapToInt(i -> i).toArray(); //list를 int[] 배열로 변환하여 반환
    }
}
