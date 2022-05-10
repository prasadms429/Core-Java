import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    int[][] TwoDArray=new int[2][3];
	    fillTwoDArray(TwoDArray);
	    printTwoDArray(TwoDArray);
	    
	    System.out.println();
	    
	    twice2DArray(TwoDArray);
	    printTwoDArray(TwoDArray);
		
	}
	
	public static void fillTwoDArray(int[][] TwoDArray){
	    Random random=new Random();
	    for(int i=0;i<TwoDArray.length;i++){                // Inside 2D array, each element in that array contains separate array.  For example, In 3D array, each element in that contains 2D array and inside of that 2D array, each element contains 1D array.
	        for(int j=0;j<TwoDArray[i].length;j++){
	            TwoDArray[i][j]=random.nextInt(100);
	        }
	    }
	    
	}
	
	public static void printTwoDArray(int[][] TwoDArray){
	    for(int arr[]:TwoDArray){
	        for(int num:arr)
	        {
	            System.out.print(num+" ");
	        }
	        System.out.println(" ");
	    }
	}
	
	public static void twice2DArray(int[][] TwoDArray){
	    for(int i=0;i<TwoDArray.length;i++){
	        for(int j=0;j<TwoDArray[i].length;j++){
	            TwoDArray[i][j]*=2;
	        }
	    }
	}
}
