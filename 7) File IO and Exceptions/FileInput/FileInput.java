import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class FileInputFun
{
	public static void main(String[] args) {
		Scanner infile;
		
		try {
		    infile=new Scanner(new  File("FileInput.txt"));
		    int input;
		    int sum=0;
		    while(infile.hasNext())
		    {
		        input=infile.nextInt();
		        System.out.println(input);
		        sum+=input;
		    }
		    System.out.println("The sum is "+sum);
		    infile.close();
		}
		catch(FileNotFoundException ex){
		    System.out.println("File not Found!");
		    System.out.println(ex.getMessage());
		}
		catch(InputMismatchException ex){
		    System.out.println("Error reading input!");
		}
		
	}
}
