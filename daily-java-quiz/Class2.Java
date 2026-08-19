// 출처:https://jungol.co.kr/ Jol 616번,9135번 문제

import java.util.Scanner;
Public class Class2{
static class Point{
     double x,y;

     Point(double x, double y){
     this.x=x;
     this.y=y;
   } 
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point p1=new Point(sc.nextDouble(),sc.nextDouble());
		Point p2=new Point(sc.nextDouble(),sc.nextDouble());
		Point p3=new Point(sc.nextDouble(),sc.nextDouble());

		double centerX = (p1.x+p2.x+p3.x)/3.0;
		double centerY = (p1.y+p2.y+p3.y)/3.0;
		
		System.out.printf("(%.1f,%.1f)\n",centerX,centerY);
	}
}

class Member {
	int id;
	int money;

	public Member(int id, int money) {
		this.id = id;
		this.money = money;
	}
}

//Jol 9135번 문제
public class Day1Coding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(+i + 1 + "번 저축금액은? ");
			int inputMoney = sc.nextInt();
			members[i] = new Member(i + 1, inputMoney);
		}
		Member king = members[0];
		for (int i = 1; i < 5; i++) {
			if (members[i].money > king.money) {
				king = members[i];
			}
		}
		System.out.println("저축왕 " + king.id + "번 " + king.money + "원");
		sc.close();
	}
}

