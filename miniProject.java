import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Product {
    String name;  // 상품 이름
    int price;    // 가격
    int stock;    // 재고 수량

    // 생성자 (처음에 상품 만들 때 씀)
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
public class MartSystem {
    public static void main(String[] args) {
        // 상품 데이터를 저장할 Map (Key: 상품이름, Value: 상품객체)
        Map<String, Product> mart = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // 초기 상품 세팅 (테스트용)
        mart.put("새우깡", new Product("새우깡", 1500, 10));
        mart.put("콜라", new Product("콜라", 2000, 5));

        while (true) {
            System.out.println("\n--- 마트 재고 관리 시스템 ---");
            System.out.println("1. 전체 상품 보기 | 2. 재고 추가 | 3. 상품 판매 | 4. 종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            if (menu == 1) {
                System.out.println("\n[현재 재고 목록]");
                // TODO: Map을 반복문 돌려서 모든 상품 이름, 가격, 재고 출력하기
                
            } else if (menu == 2) {
                System.out.print("재고를 채울 상품 이름: ");
                String name = sc.nextLine();
                // TODO: 입력한 상품이 마트에 있는지 확인하고 재고 더해주기

            } else if (menu == 3) {
                System.out.print("판매할 상품 이름: ");
                String name = sc.nextLine();
                // TODO: 재고가 있으면 1개 줄이고 금액 출력, 없으면 품절 메시지 띄우기

            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
