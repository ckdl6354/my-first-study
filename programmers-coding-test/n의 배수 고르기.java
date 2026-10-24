//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120905
import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0; 
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[index] = numlist[i]; 
                index++;                    // 배열의 자리수를 늘림
            }
        }
            // index 개수만큼 잘라서 반환
        return Arrays.copyOf(answer, index);
    }
}
