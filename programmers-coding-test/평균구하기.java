//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12944
class Solution {
    public double solution(int[] arr) {
        int sum =0;  // 숫자를합한 sum을 0으로 초기화
        for(int i=0;i<arr.length;i++){ //반복문으로 arr길이만큼 반복
            sum +=arr[i];  // arr 배열의 i번째 값을 sum에 누적해서 더한다
         }
          double answer = (double)sum/arr.length; //dobule형 answer에 숫자를 전부 더한 sum을 arr.length(길이)만큼 나눈다
          return answer;
    }
}
