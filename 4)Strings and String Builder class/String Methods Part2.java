public class StringMethods2
{
	public static void main(String[] args) {
		String name="John Baugh";
		
		String upper=name.toUpperCase();
		String lower=name.toLowerCase();
		int whereIsB=name.indexOf("B");
		String lastName=name.substring(5);
		
		System.out.println("Upper is "+upper);
		System.out.println("Lower is "+lower);
		System.out.println("B is at index of "+whereIsB);
		System.out.println("Last name is "+lastName);
		
		}
}


// NAME PARSER
import java.util.Scanner;
public class NameParser
{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String Fullname;
		System.out.println("Enter the your Full name:");
		Fullname=keyboard.nextLine();
		
		int findIndexOfSpace=Fullname.indexOf(" ");
		String FirstName=Fullname.substring(0,findIndexOfSpace);        // The second overloaded method "findIndexOfSpace" in substring takes till one character less than it, without including specified index in second parameter.
		
		String LastName=Fullname.substring(findIndexOfSpace+1);     // In LastName if specifies first index of starting LastName, then there is no need to specify ending index, because we requires all the characters after that. So, without specifying second parameter, it prints all characters.
		
		FirstName=FirstName.toUpperCase();      // It creates new object and converts that into Upper case, without modifing the value stored in that FirstName directly.
		LastName=LastName.toLowerCase();
		
		System.out.println("First name is "+FirstName);
		System.out.println("Last name is "+LastName);
		
	}
}
