// 출처:https://jungol.co.kr/ 
//Jol 9130번,613번,9131번,614번,9132번,615번 문제

// Jol 9130번 문제
package com.test;
import java.util.Scanner;
     public class Class {
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
     class Person {
     String Name;
     String School;
     int Grade;
}
     public class Day05_Class {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Person p = new Person();

     String Name = sc.next();
     String School = sc.next();
     int Grade = sc.nextInt();
     System.out.printf("Name : %s\nSchool : %s\nGrade : %d", Name, School, Grade);
}
}


//Jol 9131번 문제 해결
    class Person {
    String Name;
    int age;
{   Name = "손예준";
    age=12;
}
}
    public class Class {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Person p = new Person();

    String Name = p.Name;
    int age = p.age;

    System.out.println("친한 친구의 이름과 나이를 입력하세요. ");
    String Name1 = sc.next();
    int age1 = sc.nextInt();

    System.out.printf("당신의 이름 : %s, 나이 : %d\n",Name,age);
    System.out.printf("친구의 이름 : %s, 나이 : %d",Name1,age1);
}
	
//Jol 614번 문제 해결

	package com.test;
    import java.util.Scanner;
    class Person {
    String School;
    int grade;
{
    School = "Jejuelementary";
    grade=6;
}
}
    public class Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
             
		String School = p.School;
		int grade = p.grade;
		
		String School1 = sc.next();
		int grade1 = sc.nextInt();
		
		System.out.printf("%d grade in %s School\n",grade,School);
		System.out.printf("%d grade in %s School",grade1,School1);
	}
}
//Jol 9132번 문제
    package com.test;
    import java.util.Scanner;
    class Person {
	String name;
	int score;
	int score1;
}
    public class Class {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Person p1 = new Person();
     	p.name = sc.next();
		p.score = sc.nextInt();
		p.score1 = sc.nextInt();
		
    	p1.name = sc.next();
		p1.score = sc.nextInt();
		p1.score1 = sc.nextInt();
		
    	sum += p.score+p1.score;
		sum1 += p.score1+p1.score1;
		System.out.printf("%s %d %d\n", p.name, p.score, p.score1);
		System.out.printf("%s %d %d\n", p1.name, p1.score, p1.score1);
    	System.out.printf("합계 %d %d", sum, sum1);
	}
}
//Jol 615번 문제
package com.test;
import java.util.Scanner;
class Person {
	String name;
	int score;
	int score1;
}
public class Class {
	public static void main(String[] args) {
		int count =2;
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		Person p1 = new Person();
		
		p.name = sc.next();
		p.score = sc.nextInt();
		p.score1 = sc.nextInt();

		p1.name = sc.next();
		p1.score = sc.nextInt();
		p1.score1 = sc.nextInt();
		
        int avg = (p1.score+p.score)/2;
		int avg1 = (p1.score1+p.score1)/2;
		
		System.out.printf("%s %d %d\n", p.name, p.score, p.score1);
		System.out.printf("%s %d %d\n", p1.name, p1.score, p1.score1);
		System.out.printf("avg %d %d", (int)avg, (int)avg1);
	}
}

