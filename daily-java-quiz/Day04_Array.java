// Jol 9074번 배열 연습문제 


import java.util.Arrays;
import java.util.Scanner;

public class Day4_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
	
	while(true) {
		int num =sc.nextInt();
		
		if(num < 1 || num > 10) {
			break;
		}
		arr[num]++;
	}
	for(int i=1;i<=10;i++) {
		if(arr[i]>0) {
			System.out.println(i+": "+arr[i]+"개");
		}
	}
	}
}
