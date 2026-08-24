//문제링크:https://school.programmers.co.kr/learn/courses/30/lessons/181941?language=java


class Solution{
  public String solution(String [] arr){
    //빈 문자열("")을 구분자로 사용하여 배열의 모든 원소를 이어 붙임
    return String.join("",arr); 
  }
}

//반복문과 StringBuilder 사용
class Solution{
  public String solution(String [] arr){
    StringBuilder sb = new StringBuilder();
    for(String s : arr){
      sb.append(s);
    }
    return sb.toString();
  }
}

// for - each 루프와 문자열 더하기
class Solution{
  public String solution(String[] arr){
    String answer = "";
    for(String s : arr){
      answer += s;
    }
    return answer;
  }
}
