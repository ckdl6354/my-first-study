//문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/181915

class 글자이어붙이기 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int idx : index_list){
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();
    }
}
