//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12932
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); // long 타입 n을 문자형으로 변환(String.valueOf(n))
        int[] array = new int[str.length()]; //int형 배열의 길이 str만큼 생성
        StringBuilder sb = new StringBuilder(str); 
        sb.reverse(); //sb를 반대로 뒤집음
        for(int i=0;i<str.length();i++){ 
        array[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));  // 문자형 sb를 한글자씩 담아서 정수형으로 변환한뒤 array[] 배열에담음              
        }
        return array;
    }
}
