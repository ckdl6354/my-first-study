//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/120819
class Solution {
    public int[] solution(int money) {
        int cups = money / 5500;
        int remain = money % 5500;
        int[] answer = {cups, remain};
        return answer;

       //return new int[] { money / 5500, money % 5500 }; 으로 한줄로 풀수있다. 참고
    }
}

//문제 다르게 풀어보기
class Solution {
    public int[] solution(int flour) {
    int one = flour/350;
    int two =  flour%350;
    int[] answer = {one,two};
    return answer;
    }
}
 
