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
