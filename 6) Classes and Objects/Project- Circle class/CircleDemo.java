public class Main
{
	public static void main(String[] args) {
		Circle unitCircle=new Circle();
		Circle c2=new Circle(2);
		Circle c3=new Circle();
		
		c3.setRadius(3);
		
		printCircle(unitCircle);
		printCircle(c2);
		printCircle(c3);
		
	}
	
	public static void printCircle(Circle cir){
	    System.out.println("r: "+cir.getRadius());
	    System.out.println("c: "+
	                            String.format("%.2f",cir.circumference())); // In String.format we specify how many units we want after decimal point. like "%.2f" specifies we want two decimal point.  
	    System.out.println("a: "+
	                            String.format("%.2f",cir.area()));
	    System.out.println();
	}
}
