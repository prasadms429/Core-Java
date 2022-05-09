import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {    
		ArrayList<Integer> myAL=new ArrayList<>(); // In this "Integer" is a wrapper class. 
		myAL.add(10);
		myAL.add(20);
		
		
    for(int i=0;i<myAL.size();i++)
    {
        System.out.println(myAL.get(i));
    }
    
    String someValue="450";     // From internet we get integer values in a file in form of text, to convert that to integer type, we use this. By doing this we can do mathamatical operations on those integers.
    int NumericValue=Integer.parseInt(someValue);
    NumericValue+=10;
    System.out.println(NumericValue);
    
    String pi="3.14159";
    double integerValue= Double.parseDouble(pi);
    System.out.println(integerValue);

}
}
