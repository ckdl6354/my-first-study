//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120839/solution_groups?language=java&type=my
class 가위바위보 {
    public String solution(String rsp) {
         StringBuilder answer = new StringBuilder();
        for(int i=0;i<rsp.length();i++){
            char current = rsp.charAt(i);

            switch(current){
                    case'2':answer.append("0");
                    break;
                    case'0':answer.append("5");
                    break;
                    case'5':answer.append("2");
                    break;
            }
        }
        return answer.toString();

    }
}
