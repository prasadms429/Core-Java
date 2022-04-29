import java.util.Scanner;
public class MadLibsClone
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    String ADJECTIVE1, GIRLS_NAME, ADJECTIVE2, OCCUPATION1,PLACE,CLOTHING, HOBBY,ADJECTIVE3,OCCUPATION2,BOYS_NAME,MANS_NAME;
	    
	    System.out.print("Enter ADJECTIVE1:\t");    // "System.out.print" dont give new line to enter inputs.
	    ADJECTIVE1=keyboard.nextLine();
	    
		System.out.print("Enter GIRLS_NAME:\t");
		GIRLS_NAME=keyboard.nextLine();
		
		System.out.print("Enter ADJECTIVE2:\t");
		ADJECTIVE2=keyboard.nextLine();
		
		System.out.print("Enter OCCUPATION1:\t");
		OCCUPATION1=keyboard.nextLine();
		
		System.out.print("Enter PLACE:\t");
		PLACE=keyboard.nextLine();
		
		System.out.print("Enter CLOTHING:\t");
		CLOTHING=keyboard.nextLine();
		
		System.out.print("Enter HOBBY:\t");
		HOBBY=keyboard.nextLine();
		
		System.out.print("Enter ADJECTIVE3:\t");
		ADJECTIVE3=keyboard.nextLine();
		
		System.out.print("Enter OCCUPATION2:\t");
		OCCUPATION2=keyboard.nextLine();
		
		System.out.print("Enter BOYS_NAME:\t");
		BOYS_NAME=keyboard.nextLine();
		
		System.out.print("Enter MANS_NAME:\t");
		MANS_NAME=keyboard.nextLine();
		
		System.out.println();                         // It prints newline. To give space for nextline to look better.
		
		System.out.println("There was a "+ADJECTIVE1+" girl named "+GIRLS_NAME+" ,who was a "+ADJECTIVE2+" "+OCCUPATION1+" in the Kingdom of "+PLACE+". She loved to wear "+CLOTHING+" and  to "+HOBBY+". She wanted to marry the "+ADJECTIVE3+" "+OCCUPATION2+" named "+BOYS_NAME+" but her fatehr. King "+MANS_NAME+" forbid her from seeing him.");
	}
}
