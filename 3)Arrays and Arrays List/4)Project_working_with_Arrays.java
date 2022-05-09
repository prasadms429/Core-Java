import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {    
		int[] arr=new int[5];
		Scanner keyboard=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print("Enter an integer:");
		    arr[i]=keyboard.nextInt();
		}
		for(int num:arr)
		{
		    System.out.println("The resulted value is: "+(2*num));
		}
}
