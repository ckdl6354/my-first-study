//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181917

//∨ 기호는 OR(논리합) 연산, ∧ 기호는 AND(논리곱) 연산을 의미

class 논리연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
       return (x1 || x2) && (x3 || x4);
    }
}
