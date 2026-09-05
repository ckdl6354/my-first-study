//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181940

class 문자곱하기 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);



      // 위와 같은 정답풀이
      StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(my_string);
        }
        return sb.toString();
    }
}
