//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181915

class 문자열 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int idx : index_list){
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();
    }
}
