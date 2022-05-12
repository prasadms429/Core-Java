public class IceCreamDemo
{
	public static void main(String[] args) {
		IceCream myIC=new IceCream("Chocolate",1,1);
		IceCream yourIC=new IceCream("Straberry",3,2);
		
		myIC.addTopping("Jerry");
		myIC.addTopping("Berry");
		
		yourIC.addTopping("sprinkles");
		
		printIc(myIC);
		printIc(yourIC);
		
		
	}
	
	public static void printIc(IceCream icecream)
	{
	    System.out.println(icecream.getName()); 
	    System.out.println("Cost: $"+icecream.getCost());
	    System.out.println("Topped with:");
	    icecream.printToppings();
	    System.out.println();
	}
}
