//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181913

class 문자열 여러번 뒤집기 {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {             
            int s = queries[i][0]; 
            int e = queries[i][1]; 
            
            String reversedStr = new StringBuilder(sb.substring(s, e + 1)).reverse().toString();
            
            sb.replace(s, e + 1, reversedStr);
        }
        
        return sb.toString();
    }
}
