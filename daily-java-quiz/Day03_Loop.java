// 출처:https://jungol.co.kr/ Jol537번 문제

     // --- Jol537번 문제 ---

    import java.util.Scanner;
    public class Day3_Loop {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	int num=1,sum=0 ;
		while (num<=count) {
			sum +=num;
		   num++;
		}System.out.println(sum);
		sc.close();
	}
		}
        // --- Jol538번 문제 ---        

        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("number? ");
            
            int num = sc.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                System.out.println("positive integer");
            } else {
                System.out.println("negative number");
            }
        }
        
        sc.close();
    }
}
