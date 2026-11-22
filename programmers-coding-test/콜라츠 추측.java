//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12943
class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        while (n != 1) {  // n이 1이아닐때까지 반복
            if (answer == 500) { //answer이 500이면 -1을 리턴
                return -1;
            } else if (n % 2 == 0) { //짝수일때 n을 2로 나누고 answer 1증가
                n /= 2;
                answer++;
            } else { // 홀수일때 n에 3을 곱하고 1을 더하고 answer 1증가
                n = n * 3 + 1;
                answer++;
            }
        }
        return answer;
    }
}
