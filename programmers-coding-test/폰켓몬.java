//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/1845
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2; //고를 수 있는 최대 폰켓몬 마릿수 (N/2)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){ 
            set.add(nums[i]);  //HashSet을 이용해 중복된 폰켓몬 종류 제거.
        }
        return Math.min(set.size(),answer);  //총 폰켓몬 종류 수와 고를 수 있는 최대 마릿수 중 더 작은 값을 반환
    }
}

//위와 같은 문제 풀이 향상된 for문으로 최적화
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int maxCount = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() == maxCount) {
                return maxCount;
            }
        }
        return set.size();
    }
}
