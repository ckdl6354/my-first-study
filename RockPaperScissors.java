import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 전적을 저장할 변수들
        int wins = 0;
        int draws = 0;
        int losses = 0;

        System.out.println("=== 가위바위보 ===");

        while (true) {
            System.out.println("\n-------------------------------------");
            System.out.println("현재 전적: " + wins + "승 " + draws + "무 " + losses + "패");
            System.out.print("1.가위 | 2.바위 | 3.보 | 4.종료 -> 선택: ");
            
            int user = sc.nextInt();

            // 4를 누르면 반복문을 탈출하여 게임을 종료합니다.
            if (user == 4) {
                System.out.println("게임이 종료되었습니다. 최종 전적은 " + wins + "승 " + draws + "무 " + losses + "패 입니다.");
                break;
            }

            // 1, 2, 3 외의 숫자를 입력했을 때의 방어 코드
            if (user < 1 || user > 3) {
                System.out.println("잘못된 입력입니다. 1, 2, 3 중에서 골라주세요.");
                continue;
            }

            // 컴퓨터의 선택 (1~3 사이의 랜덤 숫자 생성)
            int com = random.nextInt(3) + 1;

            // 무엇을 냈는지 텍스트로 보여주기 위한 출력
            System.out.print("나: " + getChoiceName(user));
            System.out.println(" vs 컴퓨터: " + getChoiceName(com));

            if (user == com) {
                System.out.println("비겼습니다!");
                draws++;
                // 1. 무승부 카운트(draws)를 1 증가
                
            } else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
                System.out.println("이겼습니다!");
                wins++;
                // 2. 승리 카운트(wins)를 1 증가
                
            } else {
                System.out.println("졌습니다...");
                losses++;
                // 3. 패배 카운트(losses)를 1 증가
                
            }
        }
        sc.close();
    }

    // 숫자를 "가위", "바위", "보" 글자로 바꿔주는 편리한 함수
    public static String getChoiceName(int choice) {
        if (choice == 1) return "가위";
        if (choice == 2) return "바위";
        if (choice == 3) return "보";
        return "";
    }
}
