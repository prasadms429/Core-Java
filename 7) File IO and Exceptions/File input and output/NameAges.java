import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class NameAges
{
	public static void main(String[] args) {
		Scanner names;
		Scanner ages;
		PrintWriter pw;
		
		try{
		    names=new Scanner(new File("Student_names.txt")); // we read from this file
		    ages=new Scanner(new File("Student_ages.txt")); // read from this file.
		    pw=new PrintWriter("name_age.txt"); // write to this file.
		    
		    String tempName;
		    int age;
		    
		    while(names.hasNext()){
		        tempName=names.nextLine();
		        age=ages.nextInt();
		        
		        pw.println(tempName+" is "+age+" years old. "); 
		    }
		    
		    names.close();
		    ages.close();
		    pw.close();
		}
		catch(FileNotFoundException ex){
		    System.out.println(ex.getMessage());
		    }
		}
}
