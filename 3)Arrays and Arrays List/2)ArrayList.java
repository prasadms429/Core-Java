import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {    // Once we define array, it cannot be resized. But in ArrayList we can resize the array after defining it also.
		ArrayList<String> nameList=new ArrayList<>(); // we cannot define datatype of ArrayList as int because it stores only reference type.
		nameList.add("Jonh");
		nameList.add("Kyle");
		nameList.add("Katthen");
		nameList.add("Rendy");
		
// 		for(int i=0;i<nameList.size();i++)          // Regular "For" loop
// 		{
// 		    System.out.println(nameList.get(i));
// 		}

        for(String names:nameList)          // Enhanced "For" loop 
        {
            System.out.println(names);
        }
}
}
