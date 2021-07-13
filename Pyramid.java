import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		for (int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+i);
				
			}
			System.out.println();
		}
		
		System.out.println("***********************************************************");
		int numb=7;
		for(int i=1;i<=numb;i++)
		{
			for (int j=numb;j>=i;j--)
			{
				System.out.print("*"+j);
			}
			System.out.println();
		}
		
		System.out.println("***********************************************************");
		
		int rows, number=1,counter,j;
		Scanner scan =new Scanner(System.in);
		 rows =scan.nextInt();
		System.out.println("Floyd's Triangle");
		for ( counter =1;counter<=rows;counter++)
		{
			for(j=1;j<counter;j++)
			{
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}

}
