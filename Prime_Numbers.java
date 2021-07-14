
public class Prime_Numbers {
public static void main(String[] args) {
	int j=0;
	int num =0;
	String primenumbers=" ";
	for(int i =0;i<=100;i++)
	{
		int counter=0;
		for(num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				counter=counter+1;
			}
			if(counter==2)
			{
				primenumbers=primenumbers +i +" ";
				
				
			}
		}
	}
			
	System.out.println("Prime Numbers of 1 to 100 :" );
	System.out.println(primenumbers);
}
}
