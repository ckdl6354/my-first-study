import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionGugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문제 - 정답
        HashMap<String, Integer> map = new HashMap<>();
        map.put("3 x 4", 12);
        map.put("5 x 2", 10);
        map.put("7 x 3", 21);

        // 2. 문제를 가져옴
        ArrayList<String> list = new ArrayList<>();
        list.add("3 x 4");
        list.add("5 x 2");
        list.add("7 x 3");

        // 3. 정답을 저장
        HashSet<Integer> set = new HashSet<>();

        System.out.println("쉽게 이해하는 자료구조 구구단 퀴즈!");
        System.out.println("------------------------------------");

        // [1번 문제] -----------------------------------------
        String q1 = list.get(0); // 리스트에서 첫 번째 문제("3 x 4") 꺼내기
        System.out.print(q1 + " = ");
        int ans1 = sc.nextInt();
        
        if (ans1 == map.get(q1)) { // 맵에서 "3 x 4"의 정답(12)을 가져와 비교
            System.out.println("정답입니다!");
            set.add(3); // 3단을 맞혔으니 Set에 3 저장
        } else {
            System.out.println("틀렸습니다!");
        }

        // [2번 문제] -----------------------------------------
        String q2 = list.get(1); // 리스트에서 두 번째 문제("5 x 2") 꺼내기
        System.out.print(q2 + " = ");
        int ans2 = sc.nextInt();
        
        if (ans2 == map.get(q2)) { // 맵에서 "5 x 2"의 정답(10)을 가져와 비교
            System.out.println("정답입니다!");
            set.add(5); // 5단을 맞혔으니 Set에 5 저장
        } else {
            System.out.println("틀렸습니다!");
        }

        // 4. 최종 결과 출력
        System.out.println("------------------------------------");
        System.out.println("지금까지 맞힌 정답(중복 없음): " + set);
        
        sc.close();
    }
}
