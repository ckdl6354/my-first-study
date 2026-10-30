//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class 자릿수더하기 {
    public int solution(int n) {
        String str = String.valueOf(n); // 정수 n을 문자형으로 변환
        String [] array = str.split("");  // str 문자를  ""로 쪼개서 array배열에 넣음
        int sum = 0;
        for(String s : array){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
