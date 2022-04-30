//WHILE LOOP
public class RepetitionFun
{
	public static void main(String[] args) {
	    int count=0;
	    while(count<10)           // It is the pretest loop, before execution it checks the condition.
	    {
	        System.out.println("Count is "+count);
	        count++;
	    }
}


// DO WHILE LOOP
public class RepetitionFun
{
	public static void main(String[] args) {
	   int count2=15;
	   do                               // It is the post test loop, It always executes the condition atleast once. If sometime condition fals also it executes it one time, because it is post test loop.
	   {
	       System.out.println("Count is "+count2);
	       count2++;
	   }
	   while(count2<10);
}



public class SumFun
{
	public static void main(String[] args) {
	   Scanner keyboard=new Scanner(System.in);
		int sum=0;
		int input;
		
		System.out.println("Enter the non-negative integer to add");
		System.out.println("Or enter negative integer to exit");
		input=keyboard.nextInt();
		
		while(input>=0)
		{
		    sum+=input;
		    System.out.println("Enter the non-negative integer to add");
		    System.out.println("Or enter negative integer to exit");
		    input=keyboard.nextInt();
		}
		
		System.out.println("The sum is "+sum);
}
 
 
