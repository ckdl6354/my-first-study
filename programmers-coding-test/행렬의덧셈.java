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

public class MatrixAddition  {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows = matrixA.length;  //rows에 matrixA의 길이만큼 int형 숫자 대입
        int cols =  matrixA[0].length; //cols에 matrixA[0]의 길이만큼 int형 숫자 대입

        int[][] result = new int[ rows ][ cols ];  //int형 2차원 배열 rows,cols의 숫자만큼 배열크기생성

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j]  + matrixB[i][j];  // i랑j를 반복문을통해 matrixA[i][j] + matrixB[i][j]를 더함
            }
        }

        // 결과 출력
        System.out.println("=== 행렬 덧셈 결과 ===");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
