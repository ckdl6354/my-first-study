//
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
