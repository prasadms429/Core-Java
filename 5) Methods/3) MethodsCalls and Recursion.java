public class MethodCalls                                // In this one method is calling another method.
{
	public static void main(String[] args) {
	    DoSomething();	
	}
	
	public static void DoSomething()
	{
	    System.out.println("In Do something");
	    int result=getSomeValue();
	    System.out.println("Result: "+result);
	}
	
	public static int getSomeValue()
	{
	    return 100;
	}
}




// RECURSION

public class CountDown
{
	public static void main(String[] args) {
	    CountDownFrom(10);	
	}
	
	public static void CountDownFrom(int num){
	    if(num>=0)        // It is the base condition until which fails, recursion take place.
	    {
	        System.out.println(num);
	        CountDownFrom(num-1);
	    }
	}
}

public class CountUpTo
{
	public static void main(String[] args) {
	    CountUpTo(0,10);	
	}
	
	public static void CountUpTo(int num1,int num2){
	    if(num1<=num2)
	    {
	        System.out.println(num1);
	        CountUpTo(num1+1,num2);
	    }
	}
}

