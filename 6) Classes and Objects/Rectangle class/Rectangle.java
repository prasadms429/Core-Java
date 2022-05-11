public class Rectangle{
    private int length;
    private int width;
    
    private static int numRectangle;
    
    public Rectangle(){
        this(1,1);
    }// end of no-arg constructor or default constructor
    
    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
        numRectangle++;
    }
    
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    
    public int area(){
        return length*width;
    }
    
    public static int getNumRectangle(){
        return numRectangle;
    }
    
    public int perimeter(){
        return 2*length+2*width;
    }
}
