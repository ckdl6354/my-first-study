//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12950
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int [][] sum = new int[arr1.length][arr1[0].length]; 
      //행(arr1 길이)과 열(arr1[0] 길이) 크기에 맞춰 결과를 담을 2차원 배열 생성
        for(int i=0;i<arr1.length;i++){  //행(i)을 arr1의 길이만큼 반복
        for(int j=0;j<arr1[0].length;j++){ // 이중 반복문으로 j가 arr1[0]길이만큼 반복
            sum[i][j] = arr1[i][j]+arr2[i][j]; 
            // 같은 위치의 arr1[i][j]와 arr2[i][j]를 더한 값을 sum[i][j]에 저장
            }
        }
        return sum;
    }
}
