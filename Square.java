import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		System.out.println("Enter Side Of Square :");
		Scanner scan = new Scanner(System.in);
		double side =scan.nextDouble();
		double area =side*side;
		System.out.println("Area of Suqare :" + area);
	}

}
