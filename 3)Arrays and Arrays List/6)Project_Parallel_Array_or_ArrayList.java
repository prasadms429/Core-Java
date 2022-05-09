import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        Scanner keyboard=new Scanner(System.in);
        
        String name;
        int age;
        
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name of the Person: ");
            name=keyboard.nextLine();
            
            System.out.print("Enter age of that Person: ");
 		    age=keyboard.nextInt();
 		    // Consumes new line
		    keyboard.nextLine();
		    
		    arr1.add(name);
		    arr2.add(age);
		    System.out.println(" ");
        }
        
        for(int i=0;i<arr1.size();i++)
		{
		    System.out.println(arr1.get(i)+" is "+arr2.get(i)+" years old");
	}
	}
}
