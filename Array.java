import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		int sum =0;
		for(int i:a) 
		{
		sum =sum+i;	
		}
		System.out.println("sum of array elements is :" + sum);
		
		
		Scanner scanner = new Scanner(System.in);
		 int[] array = new int[10];
		 int sum1 = 0;
		 System.out.println("Enter the elements:");
		 for (int i=0; i<10; i++)
		 {
		 array[i] = scanner.nextInt();
		 }
		 for( int num1 : array) {
		 sum1 = sum1+num1;
		 }
		 System.out.println("Sum of array elements is:"+sum1); 
	}

}
