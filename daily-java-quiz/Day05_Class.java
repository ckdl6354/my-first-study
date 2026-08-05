// 출처:https://jungol.co.kr/ Jol9130번 문제


// Jol 9130번 문제
package com.test;
import java.util.Scanner;
public class Day1Coding {
	static class Person{
		String name;
		int age;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	
	System.out.println("당신의 이름은 무엇입니까? ");
	p.name = sc.next();
	System.out.println("당신의 나이는 몇살입니까?");
	p.age = sc.nextInt();
	System.out.printf("당신의 이름은 %s이고 나이는%d이세이군요.\n",p.name,p.age);
	}
}
//Jol 613번 문제 해결
public class Day1Coding {
static class Person{
	String Name,School;
	int Grade;
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	p.Name = sc.next();	
	p.School = sc.next();
	p.Grade = sc.nextInt();
	System.out.printf("Name : %s \nSchool : %s \nGrade : %d",p.Name,p.School,p.Grade);
	}
}


