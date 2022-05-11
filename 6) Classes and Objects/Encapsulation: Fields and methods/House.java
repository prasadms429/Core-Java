public class House // This is a House class,     // Object is an entity that contains Behavior and data. Encapsulation contains methods and data in it.
{
    private int numStories;     // These 3 lines are fields.
    private int numWindows;
    private String color;
    
    // non-arg constructor or Default constructor
    public House()
    {
        numStories=5;
        numWindows=6;
        color="Green";
    }
    
    // paramatrized constructor
    public House(int numStories,int numWindows,String color)
    {
        this.numStories= numStories;
        this.numWindows= numWindows;
        this.color= color;
    }
    
    
    public int getNumStories()      // These are methods.
    {
        return numStories;
    }
    public void setNumStories(int numStories)
    {
        this.numStories=numStories;
    }
    
    public int getNumWindows()
    {
        return numWindows;
    }
    public void setNumWindows(int numWindows)
    {
        this.numWindows=numWindows;
    }
    
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    
}
