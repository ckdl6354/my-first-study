class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];  
      //배수의 개수만큼 맞는 크기의 배열을 생성
      
        int index = 0;  
        for (int i = k; i <= n; i += k) { //k부터시작해서 k씩더해 배열을 채움
            answer[index++] = i;
        }
        
        return answer;
    }
}
