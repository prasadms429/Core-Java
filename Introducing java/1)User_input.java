import java.util.Scanner;
public class KeyboardInput			// In this 'KeyboardInput' is class name, it must be same with file name given.
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);    // 'Scanner' is to scan the console and 'System.in' to read input given.
	    String name;
	    int age;
	    String city;
	    double num;
	    
		System.out.println("What is your name ?");
		name=keyboard.nextLine();         // Due to 'nexline' method, we can enter as many as words, character until we press nextline or Enter key in keyboard.
		
		System.out.println("What is your age ?");
		age=keyboard.nextInt();
		keyboard.nextLine();
		// After 'nextLine()' method it consumes nextline generated, 
		//but it in 'nextInt()' method it leaves nexline as it is, so sometimes the it will not prompt user to enter their input, without that it prints output, 
		//So we have to enter "nextLine()" method after any non string methods like 'nextInt' or 'nextFloat' etc.
		
		System.out.println("Enter the number: "); // Program to double the entered number
		num=keyboard.nextDouble();
		keyboard.nextLine();
		num*=2;
		
		System.out.println("What is your city ?");
		city=keyboard.nextLine();
		
		System.out.println("Your name "+name);
		System.out.println("Your age "+age);
		System.out.println("The doubled value "+num);
		System.out.println("Your city "+city);
	}
}
