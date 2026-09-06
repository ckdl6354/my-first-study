//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181939

class 더크게합치기{
  public int solution(int a,int b){
    int ab = Integer.parseInt(""+a+b);
    int ba = Integer.parseInt(""+b+a);
    reutnr Math.max(ab,ba);
  }
}
