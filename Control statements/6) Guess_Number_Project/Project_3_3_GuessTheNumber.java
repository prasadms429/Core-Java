import java.util.Random;
import java.util.Scanner;
public class Project_3_3_GuessTheNumber
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    int num;
	    int numberOfGuesses=0;
	    
		Random random=new Random();
		int myRandomNumber;
		myRandomNumber=random.nextInt(100)+1;
		
		System.out.println("Enter integer to guess:");
		num=keyboard.nextInt();
		while(num!=myRandomNumber)
		{
		    if(num>=1 && num<=100)
		    {
		        if(num>myRandomNumber)
		        {
		            System.out.println("Your guesse was too high");
		            num=keyboard.nextInt();
		            numberOfGuesses++;
	    	    }
		        else if(num<myRandomNumber)
		        {
		            System.out.println("Your guesse was too low");
		            num=keyboard.nextInt();
		            numberOfGuesses++;
		        }  
		    }
		    else
		    {
		        System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
		        num=keyboard.nextInt();
		        numberOfGuesses++;
		    }
		}
		numberOfGuesses++;
		System.out.println("Congradulations! You guessed the number in "+numberOfGuesses+" guesses!");
	}
}
