import java.util.Scanner;
public class KeyboardInput			// In this 'KeyboardInput' is class name, it must be same with file name given.
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);    // 'Scanner' is to scan the console and 'System.in' to read input given.
	    String name;
	    
		System.out.println("What is your name ?");
		name=keyboard.nextLine();         // Due to 'nexline' method, we can enter as many as words, character until we press nextline or Enter key in keyboard.
		System.out.println("Your name "+name);
	}
}
