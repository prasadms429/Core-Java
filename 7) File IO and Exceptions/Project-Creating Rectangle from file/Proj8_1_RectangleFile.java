import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Proj8_1_RectangleFile{
    public static void main(String[] args){
        ArrayList<Rectangle> rectangleList=new ArrayList<>();
        
        FillArrayList(rectangleList);
        PrintArrayList(rectangleList);
    }
    
    public static void FillArrayList(ArrayList<Rectangle> rectangleAL)
    {
        Scanner infile;
        Rectangle temp;
        int length;
        int width;
        try{
            infile=new Scanner(new File("rectangle_data.txt"));
            while(infile.hasNext()){
                length=infile.nextInt();
                width=infile.nextInt();
                temp=new Rectangle(length,width);
                rectangleAL.add(temp);
            }
            infile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Could not print");
        }
    }
    
    public static void PrintArrayList(ArrayList<Rectangle> rectangleAL)
    {
      for(Rectangle r:rectangleAL){
          System.out.println("Length is "+r.getLength());
          System.out.println("Width is "+r.getWidth());
          System.out.println("Area is "+r.area());
          System.out.println("Perimeter is "+r.perimeter());
          System.out.println();
      }  
    }
}
