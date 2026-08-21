import java.util.Random;
import java.util.Scanner;

// 1. 가위, 바위, 보의 정보를 담는 Enum
enum Choice {
    SCISSORS(1, "가위"), ROCK(2, "바위"), PAPER(3, "보");
    private final int value; private final String name;
    Choice(int value, String name) { this.value = value; this.name = name; }
    public int getValue() { return value; }
    public String getName() { return name; }
    public static Choice fromValue(int value) {
        for (Choice c : values()) if (c.getValue() == value) return c;
        return null;
    }
    public int compareWith(Choice opponent) {
        if (this == opponent) return 0;
        if ((this == SCISSORS && opponent == PAPER) || (this == ROCK && opponent == SCISSORS) || (this == PAPER && opponent == ROCK)) return 1;
        return -1;
    }
}

// 2. 전적 관리 클래스
class GameRecord {
    private int wins, draws, losses, currentStreak, maxStreak;
    public void recordResult(int matchResult) {
        if (matchResult == 0) { draws++; currentStreak = 0; System.out.println("비겼습니다!"); }
        else if (matchResult == 1) { wins++; currentStreak++; if (currentStreak > maxStreak) maxStreak = currentStreak; System.out.println("이겼습니다!"); }
        else { losses++; currentStreak = 0; System.out.println("졌습니다..."); }
    }
    public void printCurrentStatus() { System.out.println("현재 전적: " + wins + "승 " + draws + "무 " + losses + "패(현재 " + currentStreak + "연승 중)"); }
    public void printFinalResult() {
        int totalGames = wins + draws + losses;
        System.out.println("\n=====================================\n [ 최종 결과 ] ");
        System.out.printf(" 총 플레이 판수 : %d판\n 최종 전적 : %d승 %d무 %d패\n 최고 연승 기록 : %d승\n", totalGames, wins, draws, losses, maxStreak);
        if (totalGames > 0) System.out.printf(" 최종 승률 : %.2f%%\n", (double) wins / totalGames * 100);
        else System.out.println(" 최종 승률 : 0.00%");
        System.out.println("=====================================");
    }
}

// 3. 컴퓨터 클래스
class ComputerPlayer {
    private final Random random = new Random();
    private static final int SCISSORS_RATE = 50, ROCK_RATE = 30;
    public Choice decideChoice() {
        int rate = random.nextInt(100);
        if (rate < SCISSORS_RATE) return Choice.SCISSORS;
        else if (rate < SCISSORS_RATE + ROCK_RATE) return Choice.ROCK;
        else return Choice.PAPER;
    }
}

// 4. 게임 엔진 클래스
class GameEngine {
    private final Scanner sc = new Scanner(System.in);
    private final ComputerPlayer computer = new ComputerPlayer();
    private final GameRecord record = new GameRecord();
    public void start() {
        System.out.println("=== 가위바위보 ===");
        while (true) {
            System.out.println("\n-------------------------------------\n"); record.printCurrentStatus();
            System.out.print("1.가위 | 2.바위 | 3.보 | 4.종료 -> 선택: ");
            if (!sc.hasNextInt()) { System.out.println("잘못된 입력입니다. 숫자를 입력하세요."); sc.next(); continue; }
            int userInput = sc.nextInt();
            if (userInput == 4) { System.out.println("사용자 요청으로 게임을 종료합니다."); break; }
            Choice userChoice = Choice.fromValue(userInput);
            if (userChoice == null) { System.out.println("잘못된 입력입니다. 1, 2, 3 중에서 골라주세요."); continue; }
            Choice computerChoice = computer.decideChoice();
            System.out.println("나: " + userChoice.getName() + " vs 컴퓨터: " + computerChoice.getName());
            record.recordResult(userChoice.compareWith(computerChoice));
        }
        record.printFinalResult(); sc.close();
    }
}

// 5. 메인 클래스
public class RockPaperScissors {
    public static void main(String[] args) { new GameEngine().start(); }
}
