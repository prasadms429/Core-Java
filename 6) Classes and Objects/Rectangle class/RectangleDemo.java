public class RectangleDemo
{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(2,3);
		
		System.out.println(Rectangle.getNumRectangle());
		
		Rectangle r3=new Rectangle(2,4);
	    System.out.println("After r3 declared: "+Rectangle.getNumRectangle()); // After r3 declared also Num of rectangle is 2 because, it is only declared, not intialized refrence of object to it.
	    
	    System.out.println(r1.perimeter());
	    System.out.println(r2.area());
	    System.out.println(r3.area());
	}
}
