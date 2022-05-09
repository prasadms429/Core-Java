import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Double> myAL= new ArrayList<>();
	    Scanner keyboard=new Scanner(System.in);
	    double num;
	    System.out.print("Enter real number to add to list or negative number to exit :");
	    num=keyboard.nextDouble();
	    
	    while(num>=0)
	    {
	        myAL.add(num);
	        System.out.print("Enter real number to add to list or negative number to exit :");
	        num=keyboard.nextDouble();
	    }
	    
	    for(int i=myAL.size()-1;i>=0;i--)
	    {
	        System.out.println(myAL.get(i));
	    }
}
}
