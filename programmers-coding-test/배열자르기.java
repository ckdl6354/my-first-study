//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120833
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1); 
      // Arrays.copyOfRange(배열,시작인덱스,끝인덱스) 끝인덱스는 포함하지않는 배열자르기
        }
    }
