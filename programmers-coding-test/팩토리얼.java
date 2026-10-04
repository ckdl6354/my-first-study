//문제출처: https://school.programmers.co.kr/learn/courses/30/lessons/120848

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 1;  //곱할 숫자
    int fact = 1;    //팩토리얼 계산 결과 값 누적할 변수
    
  //팩토리얼 결과(fact)가 n이하일때까지 반복
    while(fact <= n){
        answer++;  //다음숫자로 증가(2,3,4)
        fact = fact * answer; //증가한 숫자를 기존팩토리얼 값에 누적
    }
    return answer-1;
}
