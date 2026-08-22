// 출처:https://jungol.co.kr/ Jol9039,Jol9040,Jol537,Jol538번 문제

    //--- Jol 9039번 문제
	public class Loop {
	public static void main(String[] args) {
	for(char ch ='A';ch<='Z';ch++) {
	System.out.print(ch);
	
	 // --- 알파벳 반대로 출력
	for(char ch1 = 'Z';ch1>='A';ch1--) {
	System.out.print(ch1);
	}
  }	
    
		//--- Jol 9039번 문제

		int num = 1;
		int sum = 0;
		while (true) {
			sum += num;
			if (num >= 10) {
				num++;
				break;
			}
			num++;
		}
		System.out.println(String.format("1부터 10까지의 합 = %d", sum));
		System.out.println(String.format("while문이 끝난 후의 num의 값 = %d", num));
	}
}
		
    // --- Jol537번 문제 ---

    import java.util.Scanner;
    public class Loop {
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
