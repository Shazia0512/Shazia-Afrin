
public class Swap_Numbers {
public static void main(String[] args) {
	float fire=8.9f , water=17.5f;
	System.out.println("Before Swap");
	System.out.println("First Number :" +fire);
	System.out.println("Second Number:" +water);
	
	float temporary = fire;
	 fire =water;
	 water= temporary;
	  System.out.println("After swap");
	  System.out.println("First number:" + fire);
	  System.out.println("Second number :"+water);
}
}
