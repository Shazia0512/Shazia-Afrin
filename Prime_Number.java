import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		System.out.println("The value is :");
		Scanner scan = new Scanner(System.in);
		int value,j =0; 
		int prime=0;
		int n =scan.nextInt();
		value = n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not a prime Number");
		}
		else
		{
			for(j=2;j<=value;j++)  
			{
				if(n%j==0)
				{
					System.out.println(n+"is not a prime number ");
					prime =1;
					break;
				}
			}
			if(prime==0)
			{
				System.out.println(n+"is prime number");
			}
		}

	}





}

