

public class Reverse_Number {
public static void main(String[] args) {
	int num =9874563;
	int reverse =0;
		while (num!=0)
	{
		reverse=reverse*10;
		reverse=reverse+num%10;
		num=num /10;
		System.out.println("Reverse of Input num is :"+reverse);
	}
	
	
}
}
