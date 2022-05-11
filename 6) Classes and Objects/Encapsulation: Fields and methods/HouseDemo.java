public class HouseDemo
{
	public static void main(String[] args) {
		House myHouse=new House();
		House yourHouse=new House(6,7,"SKY-Blue");
		
		myHouse.setNumStories(2);
		myHouse.setNumWindows(3);
		myHouse.setColor("Blue");
		
        printHouseData(myHouse);
        printHouseData(yourHouse);
		
// 		yourHouse.setNumStories(3);
// 		yourHouse.setNumWindows(4);
// 		yourHouse.setColor("Grey");

// 		System.out.println("My house of "+myHouse.getColor()+" color. It has "+myHouse.getNumWindows()+" windows and "+myHouse.getNumStories()+" number of stories");
// 		System.out.println("Your house of "+yourHouse.getColor()+" color. It has "+yourHouse.getNumWindows()+" windows and "+yourHouse.getNumStories()+" number of stories");
	}
	
	public static void printHouseData(House house){     // Without writing print statement over and again and again, we can create a method to print the data.
	    System.out.println("The house of "+house.getColor()+" color. It has "+house.getNumWindows()+" windows and "+house.getNumStories()+" number of stories");
	    
	}
}
