//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181930
class Solution {
    public int solution(int a, int b, int c) {
        int sum =0;
            if(a==b && b==c){
        sum=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);  // 제곱을 a*a로 표현
                return sum;
            }else if(a==b || b==c || c==a){
            sum = (a+b+c)*(a*a+b*b+c*c);
            return sum;
            }else {
            sum = a+b+c;
                return sum;
            }
        
    }
}
