

public class Average {
	int sum=0;
  public void Problem(int a) {
	  for(int i=0;i<=a;i++)
	  {
		 sum += i; 
	  }
	  System.out.println(sum/a);
  }
	
public static void main(String[] args) {
	Average avg= new Average();
	avg.Problem(100);
	
}
}
