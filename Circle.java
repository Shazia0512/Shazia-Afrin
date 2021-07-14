import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	 System.out.println("Enter The Radius :");
	 Scanner scan = new Scanner(System.in);
	 
	 double radius=scan.nextDouble();
	 double area =Math.PI*(radius*radius);
	 System.out.println("The area of the circle is :"+area);
	 double circumference=Math.PI * 2*radius;
	 System.out.println("The circumference of the circle is :" + circumference);
}
}
