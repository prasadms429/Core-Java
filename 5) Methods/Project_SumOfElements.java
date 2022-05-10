import java.util.ArrayList;
public class sumOfElements
{
	public static void main(String[] args) {
	    ArrayList<Integer> someList=new ArrayList<>();
	    someList.add(1);
	    someList.add(2);
	    someList.add(3);
	    someList.add(4);
	    someList.add(5);
	    
	    int sum=SumElements(someList);
	    System.out.println("The sum is: "+sum);
		
	}
	
	public static int SumElements(ArrayList<Integer> list){
	    int sum=0;
	    
	    for(int i=0;i<list.size();i++)
	    {
	        sum+=list.get(i);
	    }
	    return sum;
	    
	}
}
