import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    String name;
    int price;
    int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Map<String, Product> mart = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // 초기 데이터 입력
        mart.put("새우깡", new Product("새우깡", 1500, 10));
        mart.put("콜라", new Product("콜라", 2000, 5));

        // 메인 루프: 1.목록, 2.추가, 3.판매, 4.종료 기능 수행
        while (true) {
            System.out.println("\n--- 마트 재고 관리 시스템 ---");
            System.out.println("1. 전체 상품 보기 | 2. 재고 추가 | 3. 상품 판매 | 5. 새 상품 등록 | 4. 종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();
            sc.nextLine(); 
            
            if (menu == 1) { // 전체 목록 출력
                System.out.println("\n[현재 재고 목록]");
                for (Product p : mart.values()) {
                    String stockState = (p.stock == 0) ?"품절": p.stock+"개";
                    System.out.println("상품명: " + p.name + " | 가격: " + p.price + "원 | 재고: "+ stockState);
                }
            } else if (menu == 2) {
                System.out.print("재고를 채울 상품 이름: ");
                String name = sc.nextLine();
                if (mart.containsKey(name)) {
                    System.out.print("추가할 수량: ");
                    mart.get(name).stock += sc.nextInt();
                    sc.nextLine();
                    System.out.println(name + " 재고가 업데이트 되었습니다.");
                } else {
                    System.out.println("존재하지 않는 상품입니다.");
                }
            } else if (menu == 3) { 
                System.out.print("판매할 상품 이름: ");
                String name = sc.nextLine();
                if (mart.containsKey(name) && mart.get(name).stock > 0) {
                    mart.get(name).stock--;
                    System.out.println(name + " 판매 완료.");
                } else {
                    System.out.println("판매 불가 (재고 부족 또는 상품 없음)");
                }
            } else if (menu == 5) { // 새 상품 등록
    System.out.print("등록할 새 상품 이름: ");
    String name = sc.nextLine();
    
    // 이미 존재하는 상품인지 확인하는 방어 코드
    if (mart.containsKey(name)) {
        System.out.println("이미 등록된 상품입니다. (재고 추가 메뉴를 이용하세요)");
    } else {
        System.out.print("상품 가격: ");
        int price = sc.nextInt();
        
        System.out.print("초기 재고 수량: ");
        int stock = sc.nextInt();
        sc.nextLine(); // 인트 입력 후 남은 엔터 제거 (버그 방지)
        
        // 마트에 새 상품 객체 생성해서 넣기
        mart.put(name, new Product(name, price, stock));
        System.out.println("[" + name + "] 상품이 새로 등록되었습니다.");
    }
            } else if ( menu == 4) {
                int totalStock = 0;
                for (Product p : mart.values()) {
                    totalStock += p.stock; // 모든 상품의 재고를 더함
    }
    System.out.println("\n[마감 브리핑] 현재 마트에 남은 총 재고는 " + totalStock + "개입니다.");
    System.out.println("프로그램을 종료합니다.");
    break;
            } else { 
                System.out.println("잘못된 입력입니다.");
        }
    }
     sc.close();
 }
}
