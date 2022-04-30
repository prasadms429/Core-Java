import java.util.Random;
public class RandomFun
{
	public static void main(String[] args) {
	    Random random= new Random();
	    int myRandomNumber;
	    
	    myRandomNumber=random.nextInt();
		System.out.println("number is \t"+myRandomNumber);
		
		myRandomNumber=random.nextInt(1000);                    // prints random number between 0 t0 999
		System.out.println("number is \t"+myRandomNumber);
		
		myRandomNumber=random.nextInt(1000)+1;                 // prints random number between 1 t0 1000  , This is also called shifting technique.
		System.out.println("number is \t"+myRandomNumber);
		
	}
}
