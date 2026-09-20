//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181932

class 코드처리하기 {
    public String solution(String code) {
        StringBuilder sb =new StringBuilder();
        int mode=0;
        for(int i=0;i<code.length();i++){
            char ch =code.charAt(i);
            if(ch=='1'){
            mode = (mode==0)?1:0;
            }else{
            if(i%2==mode){
            sb.append(ch);
                }
            }
        }
        if(sb.length()==0){
            return "EMPTY";
        }else{
            return sb.toString();
        }
        
    }
}
