import java.util.Scanner;



public class while_Loop {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	int number=scan.nextInt();
	int sum =0;
	while (number<21)
	{
		sum=sum+number;
		number++;
		
	}
	System.out.println("sum of numbers are:"+sum);
}
}
