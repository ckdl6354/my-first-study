// 출처:https://jungol.co.kr/ Jol537,Jol538번 문제

 //--- Jol 9039번 문제
	public class Day3_Loop {
	public static void main(String[] args) {
	for(char ch ='A';ch<='Z';ch++) {
	System.out.println(ch);
	}
  }	
}

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
    }
}
