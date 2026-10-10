//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120829

class Solution {
    public int solution(int angle) {
        int quotient = angle/90;
        switch(quotient){
            case 0: return 1;
            case 1: if(angle%90==0){return 2;}else{return 3;}
            case 2: return 4;
            default: return 0;
        }
    }
}
