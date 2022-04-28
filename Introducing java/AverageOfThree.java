import java.util.Scanner;
public class AverageOfThree
{
	public static void main(String[] args) {
		double num1,num2,num3,Average;
	    Scanner keyboard=new Scanner(System.in);
	    
		System.out.println("Enter first number:");
		num1=keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Enter second number:");
		num2=keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Enter third number:");
		num3=keyboard.nextDouble();
		keyboard.nextLine();
		
		Average=(num1+num2+num3)/3.0;
		
		System.out.println("The Average is "+Average);
	}
}
