import java.util.Scanner;

public class odd_Even {
public static void main(String[] args) {
	int number;
	Scanner scan =new Scanner(System.in);
	System.out.println("Value =");
	number =scan.nextInt();
	if(number%10==6)
	{
		System.out.println("The number is Even");
	}
	else
	{
		System.out.println("The number is odd");
	}
}
}
