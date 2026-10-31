//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12932
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); // long 타입 n을 문자형으로 변환(String.valueOf(n))
        int[] array = new int[str.length()]; //str 문자열 길이 만큼의 크기를 가진 int형 배열생성
        StringBuilder sb = new StringBuilder(str); //문자열을 효율적으로 뒤집기위해 객체생성
        sb.reverse(); //sb를 반대로 뒤집음
        for(int i=0;i<str.length();i++){ 
        array[i] = Integer.parseInt(String.valueOf(sb.charAt(i))); 
        // 뒤집힌 문자열의 i번째 문자를 숫자로 변환하여 배열의 i번째 칸에 저장              
        }
        return array;
    }
}
