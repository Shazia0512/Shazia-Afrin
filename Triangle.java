import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
	System.out.println("Enter The Width Of The Triangle :");
	Scanner scanner =new Scanner(System.in);
	double base =scanner.nextDouble();
	
	System.out.println("Enter The Height Of The Triangle :");
	double height=scanner.nextDouble();
	
	double area = (base*height)/2;
	
	System.out.println("Area Of Triangle :" + area);
}
}
