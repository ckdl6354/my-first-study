class 문자열만들기 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int idx : index_list){
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();
    }
}
