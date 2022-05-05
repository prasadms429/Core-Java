import java.util.Scanner;
public class Project_3_1_LearningPackage
{
	public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
    int total_cost, packageNumber,Total_courses_enrolled, NumberOfCourses, package_cost, cost_per_course;
    
    System.out.println("Which of the package do you want 1,2 or 3:");
    packageNumber=keyboard.nextInt();
    
    System.out.println("How many courses did you enroll in this month:");
    Total_courses_enrolled=keyboard.nextInt();
    
    if(packageNumber==1)
    {
        package_cost=10;
        NumberOfCourses=2;
        cost_per_course=6;
    }
    else if(packageNumber==2)
    {
        package_cost=12;
        NumberOfCourses=4;
        cost_per_course=4;
    }
    else
    {
        package_cost=15;
        NumberOfCourses=6;
        cost_per_course=3;
    }
    
    if(Total_courses_enrolled>NumberOfCourses)
    {
        total_cost=package_cost+ (( Total_courses_enrolled - NumberOfCourses ) * cost_per_course);
        System.out.println("Total cost is "+total_cost);
    }
    else
    {
        total_cost=package_cost;
        System.out.println("Total cost is "+total_cost);
    }
	}
}
