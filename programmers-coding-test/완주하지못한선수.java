//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/42576
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> list = new HashMap<>(); // 문자(key)와 숫자(value)
        
        for (int i = 0; i < participant.length; i++) {
            list.put(participant[i], list.getOrDefault(participant[i], 0) + 1); 
           //list에서 이름을 찾아 기존 숫자에 1을 더한다.(list에 아직 없는 이름이면 0에서 시작해 1을더함)
        }
        
        for (int i = 0; i < completion.length; i++) {
            list.put(completion[i], list.get(completion[i]) - 1); //list에서 completion에 같은 이름을 찾아 -1을 뺀다.
        }
        
        for (String key : list.keySet()) { //list.keySet()은 위에서부터 하나씩 꺼내보기 
            if (list.get(key) != 0) { //key(value)가 0이 아니면(즉,1이면) key(이름)를 반환
                return key;
            }
        }
        
        return "";
    }
}

// 위와 풀이 방법은 비슷하지만 변수만 다른 문제풀이
import java.util.HashMap;
class Solution {
    public String solution(String[] borrowed, String[] returned) {
        HashMap<String,Integer> book = new HashMap<>();
        for(int i=0;i<borrowed.length;i++){
            book.put(borrowed[i],book.getOrDefault(borrowed[i],0)+1);
        }
        for(int i=0;i<returned.length;i++){
            book.put(returned[i],book.get(returned[i]-1);
        }
        for(String key : book.keySet()){
            if(book.get(key) != 0){
                return key;
            }
        }
        return "";
    }
}
// HashSet을 이용한 문제풀이
import java.util.HashSet;
class Solution {
    public int solution(int[] items) {
        int maxPick = items.length / 2;  //정수형 maxPick에 items의 길이의 2를 나눈값을 넣는다.        
        HashSet<Integer> set = new HashSet<>(); 
        for (int i = 0; i < items.length; i++) {  
            set.add(items[i]); //set에 items를 하나씩 집어넣는다.
        }
        return Math.min(set.size(),maxPick);  //둘중 비교해 작은 값을 바로 반환
        }
    }
}

//put : 넣기,덮어쓰기 ( 처음저장하거나 기존값을 새로운값으로 수정할때)
//get : 꺼내보기 (특정 Key에 어떤 값이 들어있는지 조회할때,없으면 null)
//getOrDefault(Key,기본값) : 없으면 기본값주기 ( 개수(카운트),처음등장한 데이터도 에러없이 0부터세기위해씀)
//keySet() : 이름표만 다모으기 (맵에 어떤 Key들이 들어있는지 전체 반복문을 돌며 하나씩 확인)
//size() : 사용중인 개수(총 몇개),(중복을 제거한 고유한 종류가 몇가지인지)
//containsKey(K) : 이름표가있는지 (중복체크를 하거나 특정 데이터가 이미 저장되어있는지 true,false로 확인)
//values() : 내용물(값)만 다 모으기 (Key(이름)은 필요없고, 저장된 숫자들의 합계나 최대값만 구할때씀
