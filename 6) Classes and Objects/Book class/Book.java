public class Book{
    private String author;
    private String title;
    private String genre;
    private int numPages;
    
    public Book(String author,String title,String genre,int numPages){
        this.author=author;
        this.title=title;
        this.genre=genre;
        this.numPages=numPages;
    }
    
    public String getAuthor(){ // only "getters" used in this class, no mutator such as "setters" are used in this class.
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getNumPages(){
        return numPages;
    }
    
    public void printBooks(){   // In this method we can access title and other details of Book, withought using getter methods because, it is declared inside the class. So, it can access private member also.
	    System.out.println("The Book "+title+" written by "+author+" has "+numPages+" Pages "+" and it genre is "+genre);
	    System.out.println();
	}
}
