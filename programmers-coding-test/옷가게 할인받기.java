//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120818
class Solution {
    public int solution(int price) {
     if(price>=500000){
         return (int)(price*0.80);
     }else if(price>=300000){
        return (int)(price*0.90);
     }else if(price>=100000){
       return (int)(price*0.95);
    }else{
        return price;
     }
    }
}
