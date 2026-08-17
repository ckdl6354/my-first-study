//Jol 613번 문제풀이
import java.util.Scanner;
  public class Class2 {
  String Name;
	String School;
	int Grade;
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner (System.in);
		Day1Coding day1 = new Day1Coding();
		day1.Name = sc.next();
		day1.School = sc.next();
		day1.Grade = sc.nextInt();
		System.out.println("Name : "+day1.Name+"\nSchool : "+day1.School+"\nGrade : "+day1.Grade);
		}
}
