// 출처:https://jungol.co.kr/ Jol9074번,9063번,555번,9066번,151번 문제

// Jol 9074번 문제

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
// Jol 9063번 문제
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//Jol 555번 문제
		Scanner sc = new Scanner(System.in);
		String [] ch = new String [10];
		for(int i=0;i<ch.length;i++) {
			ch[i] = sc.next();
		}
		for(int i =0;i<ch.length;i++)
		System.out.print(ch[i]);
		}
	}
	//Jol 9066번 문제

        char [] ch = new char [26];
		char input='A';
		for(int i =0;i<ch.length;i++) {
			ch[i] = input;
		input++;
		}
			for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]+" ");
		}
	}
}
// Jol 151번 문제
public class Day04_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i == 0 || i == 2 || i == 4) {
				sum += arr[i];				
			}
		}
		System.out.print(sum);
	}
}
		
}
