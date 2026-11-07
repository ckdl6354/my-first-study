//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12916
class Solution {
    boolean solution(String s) {
        int pCnt = 0; 
        int yCnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){  //s의 문자열중 p,P이면 pCnt증가
                pCnt++;
            }else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){  //y의 문자열중 y,Y이면 yCnt증가
                yCnt++;
            }
        }
        return pCnt == yCnt;  // pCnt == yCnt 조건이 참이면 true반환
    }
}
