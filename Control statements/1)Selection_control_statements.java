//USING MULTIPLE IF ELSE STATEMENTS
import java.util.Scanner;
public class SelectionFun
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    int age;
	    
		System.out.println("Welcome to the Pub and Grille");
		System.out.println("please enter your age:");
		age=keyboard.nextInt();
		
		if(age>=21)
		{
		    System.out.println("Here have a beer");
		}
		else if(age>=16)
		{
		    System.out.println("Here have a coke");
		    System.out.println("Atleast you can drive");
		}
		else{
		    System.out.println("Here have a coke");
		}
		System.out.println("Thanks for comming Pub and Grille");
	}
}


// USING SWITCH STATEMENT
import java.util.Scanner;
public class GradeFun
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    char grade;
	    
	    System.out.println("Enter grade:");
	    grade=keyboard.next().charAt(0);    // To input a one character at a time.
	    
	    
	    switch(grade)
	    {
	        case 'A':
	            case 'a':
	                System.out.println("Great job!");
	                break;
	        case 'B':
	            case 'b':
	                System.out.println("Good job");
	                break;
	        case 'C':
	            case 'c':
	                System.out.println("You can do better");
	                break;
	        case 'D':
	            case 'd':
	                System.out.println("You are near to failing");
	                break;
	        case 'F':
	            case 'f':
	                System.out.println("You are failed");
	                break;
	        default:
	        System.out.println("Invalid character");
	    }
	}
}


// Eligible to join fraternity or not
import java.util.Scanner;
public class Fraternity
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    char gender;
	    int age;
	    
	    System.out.println("Enter the gender:");
	    gender=keyboard.next().charAt(0);
	    
	    System.out.println("Enter the age:");
	    age=keyboard.nextInt();
	    
	    if(gender=='M' && age>=19)
	    {
	        System.out.println("You can join fraternity");
	    }
	    else
	    {
	        System.out.println("Sorry, you cannot join fraternity");
      }   
	}
}
