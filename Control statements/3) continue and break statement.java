public class ContinueBreak
{
	public static void main(String[] args) {
	    int count=0;
	    
	    while(count<10)
	    {
	        if(count ==5)
	        {
	            continue;           // when count=5, continue prompts the control of program to top of while loop, until the condition fails, so in this it enters to infinite loop.
	        }
	        count++;
	        System.out.print(count+" \t");
	    }
}
  
  
public class ContinueBreak
{
	public static void main(String[] args) {
	     int count =0;
	    while(count<10)
	    {
	        if(count ==5)
	        {
	            count++;
	            continue;           // when count=5, continue prompts the control of program to top of while loop. So, it dont print 5 in this program.
	        System.out.print(count+" \t");
	        count++;
	    }
}
    
    
public class EvenOnly
{
	public static void main(String[] args) {
	    int num=0;
	    while(num<10)
	    {
	        if(num%2!=0)
	        {
	         num++;
	         continue;
	        }
	        System.out.print(num+" \t");
	        num++;
	    }
}
  
