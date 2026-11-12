//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/12922
class Solution {
    public String solution(int n) {
        String str= "수박".repeat(5000);
        return str.substring(0,n);        
    }
}
// 위와 동일하게 풀수있다.
// class Solution {
//     public String solution(int n) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb.append(i % 2 == 0 ? "수" : "박");
//         }
//         return sb.toString();
//     }
// }
