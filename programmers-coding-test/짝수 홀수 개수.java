//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120824
class Solution {
    public int[] solution(int[] num_list) {
        int evencount = 0;
        int oddcount=0;
        for(int i =0;i<num_list.length;i++){
          int list = num_list[i];
            if(list % 2 == 1){
                oddcount++;
            }else{
                evencount++;
            }  
        }
        return new int[]{evencount,oddcount};
    }
}
