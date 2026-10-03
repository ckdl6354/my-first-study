//문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/120830

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
        int service = n/10;    // 음료수 서비스 
        k = k - service;      //음료수 서비스받은걸 뺌
        int answer = n * 12000+k*2000; // 양꼬치 인분에 12000원을 곱한뒤 음료수 2000원을 더함
      return answer;
 
    }
