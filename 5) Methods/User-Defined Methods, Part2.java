public class Main
{
  public static void main (String[]args)
  {
      int result=getResult(10);
      System.out.println(result);
      
      result=getResult(10,10);
      System.out.println(result);
      
      result=getResult(10,"10");
      System.out.println(result);
      
      System.out.println(getResult("Prasad","MS"));

  }

  public static int getResult (int num)
  {
    return num*2;
  }
  
  public static int getResult(int num1,int num2)
  {
	return num1*num2;
  }
  
  public static int getResult(int num1, String num2)
  {
	return num1+Integer.parseInt(num2);
  }
  
  public static String getResult(String name1, String name2)
  {
	return name1+" "+name2;
  }
  
}
