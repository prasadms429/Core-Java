import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		ArrayList<String> firstNames=new ArrayList<>();
		ArrayList<String> LastNames=new ArrayList<>();
		
		String Fullname;
		for(int i=0;i<5;i++){
		    System.out.print("Enter the your Full name "+i+"\t");
		    Fullname=keyboard.nextLine();
		
		    int findIndexOfSpace=Fullname.indexOf(" ");
		    
		    String FirstName=Fullname.substring(0,findIndexOfSpace);
		    firstNames.add(FirstName);
		
		    String LastName=Fullname.substring(findIndexOfSpace+1);
		    LastNames.add(LastName);
		}
		
		// Now for permutations
		
		for(int i=0;i<firstNames.size();i++)
		{
		    for(int j=0;j<LastNames.size();j++)
		    {
		        System.out.println(firstNames.get(i)+" "+LastNames.get(j));
		    }
		}
	}
}
