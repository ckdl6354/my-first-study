//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181926

class 수 조작하기 {
    public int solution(int n, String control) {
       for(int i=0;i<control.length();i++){  
    // for(char ch : control.toCharArray())으로도 사용가능하다
            char ch =control.charAt(i);
       
        switch(ch){
            case 'w': n++;
                break;
                case 's':n--;
                break;
            case 'd':n+=10;
                break;
            case 'a':n-=10;
                break;
            }
       }
        return n;
    }
}
