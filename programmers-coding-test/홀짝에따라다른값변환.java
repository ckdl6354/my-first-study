//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181935

class 홀짝에따라다른값변환 {
    public int solution(int n) {
        int sum = 0;        
        for (int i = 1; i <= n; i++) {   // 1. n이 홀수일 때 -> i가 홀수인 것만 골라서 그냥 더하기
            if (n % 2 != 0) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            // 2. n이 짝수일 때 -> i가 짝수인 것만 골라서 제곱해서 더하기
            else {
                if (i % 2 == 0) {
                    sum += (i * i);
                }
            }
        }
        return sum;
    }
}
