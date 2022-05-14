import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileOuputFun
{
	public static void main(String[] args) {
		try{
		    PrintWriter pw=new PrintWriter("output.txt");   // It creates one file called "output.txt" and print output to that file.
		    pw.println("Hello there!");
		    pw.println("My name is Prasad M S");
		    pw.close();
		}
		catch(FileNotFoundException ex){
		    System.out.println("Couldn't write to file");
		}
	}
}
