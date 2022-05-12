import java.util.ArrayList;
public class IceCream{
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings=new ArrayList<>();
    
    public IceCream(String name, int cost, int numScoops){
        this.name=name;
        this.cost=cost;
        this.numScoops=numScoops;
    }
    
    public void addTopping(String topping){
        toppings.add(topping);
    }
    
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getNumScoops(){
        return numScoops;
    }
    
    public void printToppings(){
        for(int i=0;i<toppings.size();i++){
            System.out.println(toppings.get(i));
        }
    }
}
