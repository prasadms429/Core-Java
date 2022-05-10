public class Main
{
	public static void main(String[] args) {
		printHello();
		printNumber(5);
		
		int result= giveMe10();
		System.out.println(result);
		
		result=addTheseTwo(10,10);		// In this call by value "10,10" are called arguments.
		System.out.println(result);
		
		double dresult;
		dresult=square(3);
		System.out.println(dresult);
		// or
		System.out.println(square(3));
	}
	
	//void, parameterless
	public static void printHello(){
	    System.out.println("Hello there!");
	}
	
	// void, parameterized
	public static void printNumber(int a){
	    System.out.println("The number is "+a);
	}
	
	// return, parameterless
	public static int giveMe10()
	{
	    return 10;
	}
	
	// return, parameterized
	public static int addTheseTwo(int num1,int num2){	// In this defining method, "num1 and num2" are parameters.
	    return num1+num2;
	}
	
	public static double square(double a){
	    return a*a;
	}
}
