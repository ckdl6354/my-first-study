//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12910
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < arr.length; i++) { //반복문으로 arr[]배열 길이만큼 반복
            if (arr[i]%divisor==0) {  
                list.add(arr[i]); //반복문으로 돌린 arr[i]가 divisor을 나눈 나머지가 0이면 list에 arr[i]를 추가
            }
        }
        
        if (list.isEmpty()) {  //list가 비어있으면 새로운 int [] 배열 -1을 반환
            return new int[]{-1};
        }
        Collections.sort(list); //list를 오름차순 정렬
        int[] answer = new int[list.size()]; // answer배열 list의 길이만큼 생성
        for (int i = 0; i < list.size(); i++) { 
            answer[i] = list.get(i); //answer[i]을 반복문으로 돌려서 list에있는값을 가져옴
        }
        
        return answer;
    }
}
