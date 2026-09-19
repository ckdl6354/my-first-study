//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181853

class 뒤에서 5등까지 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[5];
        int temp;
        for(int i=0; i<num_list.length-1; i++){
            for(int j=0; j<num_list.length-1-i; j++){
                if(num_list[j]>num_list[j+1]){
                    temp = num_list[j];
                    num_list[j] = num_list[j+1];
                    num_list[j+1] = temp;
                }
            }
        }
        System.arraycopy(num_list, 0, answer, 0, 5);
        return answer;
    }
}
