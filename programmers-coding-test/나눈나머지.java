//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181914

class 나눈나머지 {
    public int solution(String number) {
        int sum = 0;
        for(int i=0;i<number.length();i++){
            sum+=number.charAt(i) - '0';
        }
            return sum%9;
        }
    }

// i = 0 일때 '1'-'0' = 숫자 1 , sum = 1
// i = 1 일때 '2'-'0' = 숫자 2 , sum = 1+2+3
// i = 2 일때 '3'-'0' = 숫자 3,  sum = 3+3+6
// sum % 9 = 6 % 9 = 6을 반환
