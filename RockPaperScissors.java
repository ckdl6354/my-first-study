import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int wins = 0;
        int draws = 0;
        int losses = 0;

        System.out.print("목표 승리 횟수를 입력하세요: ");
        int targetWins = sc.nextInt();

        System.out.println("=== 가위바위보 ===");
        
        while (true) {
            System.out.println("\n-------------------------------------");
            System.out.println("현재 전적: " + wins + "승 " + draws + "무 " + losses + "패");
            System.out.print("1.가위 | 2.바위 | 3.보 | 4.종료 -> 선택: ");
            
            int user = sc.nextInt();

            if (user == 4) {
                System.out.println("게임이 종료되었습니다. 최종 전적은 " + wins + "승 " + draws + "무 " + losses + "패 입니다.");
                break;
            }

            if (user < 1 || user > 3) {
                System.out.println("잘못된 입력입니다. 1, 2, 3 중에서 골라주세요.");
                continue;
            }
            
            int com = random.nextInt(3) + 1;

            System.out.print("나: " + getChoiceName(user));
            System.out.println(" vs 컴퓨터: " + getChoiceName(com));

            if (user == com) {
                System.out.println("비겼습니다!");
                draws++;
                
            } else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
                System.out.println("이겼습니다!");
                wins++;
            
              if (wins == targetWins) {
              System.out.println("\n축하합니다! 승리 횟수(" + targetWins + "승)를 달성하여 게임을 종료합니다.");
              break;
            }      
        } else {
                System.out.println("졌습니다...");
                losses++;
                System.out.println("게임이 즉시 종료됩니다.");
                break;
            }
        }
        sc.close();
    }

    public static String getChoiceName(int choice) {
        if (choice == 1) return "가위";
        if (choice == 2) return "바위";
        if (choice == 3) return "보";
        return "";
    }
}
