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

            // [수정 1] 사용자가 4번 종료를 눌렀을 때의 처리 블록
            if (user == 4) {
                System.out.println("사용자 요청으로 게임을 종료합니다.");
                break; // 루프를 탈출하여 맨 아래의 최종 결과 출력으로 이동합니다.
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
                    System.out.println("\n축하합니다! 목표 승리 횟수(" + targetWins + "승)를 달성했습니다!");
                    break; // 목표 달성 시 루프 탈출
                }      
            } else {
                System.out.println("졌습니다...");
                losses++;
                System.out.println("패배하여 게임이 즉시 종료됩니다.");
                break; // 패배 시 루프 탈출
            }
        }

        // [수정 2] 게임이 완전히 끝난 후(while 루프 밖) 최종 판수와 승률을 딱 한 번 출력합니다.
        int totalGames = wins + draws + losses;
        System.out.println("\n=====================================");
        System.out.println("             [ 최종 결과 ]            ");
        System.out.printf(" 총 플레이 판수 : %d판\n", totalGames);
        System.out.printf(" 최종 전적       : %d승 %d무 %d패\n", wins, draws, losses);
        
        if (totalGames > 0) {
            double winRate = (double) wins / totalGames * 100;
            System.out.printf(" 최종 승률       : %.2f%%\n", winRate);
        } else {
            System.out.println(" 최종 승률       : 0.00%");
        }
        System.out.println("=====================================");

        sc.close();
    }

    public static String getChoiceName(int choice) {
        if (choice == 1) return "가위";
        if (choice == 2) return "바위";
        if (choice == 3) return "보";
        return "";
    }
}
