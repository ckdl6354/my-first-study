//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181931

class 특정한 항만 더하기 {
    public int solution(int a, int d, boolean[] included) {
        int answer=0;
        for(int i=0;i<included.length;i++){
           
            if(included[i]==true){
                answer +=(a+(i*d));
            }
        }
        return answer;
    }
}
