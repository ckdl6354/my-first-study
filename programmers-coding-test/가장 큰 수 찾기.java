//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120899
class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int index = 0;
        for(int i =0; i<array.length;i++){
            if(array[i] >max){
                max = array[i];  // 배열 array[i]를 max 변수에 대입
                index = i; // 가장 큰 수의 위치(인덱스) i를 index 변수에 저장
            }
        }
        return new int []{max,index}; // 최댓값과 그 인덱스를 담은 새로운 정수형 배열을 생성하여 반환
    }
}
