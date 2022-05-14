import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class writeNames
{
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
        names.add("Prasad");
        names.add("Prakruthi");
        names.add("Kaju");
        names.add("Randy");
        names.add("Candy");
        try{
           PrintWriter pw=new PrintWriter("names.txt");
           for(int i=0;i<names.size();i++){
               pw.println(names.get(i));
           }
           pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Could not find file");
        }
	}
}
