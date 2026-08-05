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
	System.out.printf("당신의 이름은 %s이고 나이는%d이세이군요.",p.name,p.age);
	}
}
