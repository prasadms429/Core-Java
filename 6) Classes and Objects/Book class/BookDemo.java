public class BookDemo
{
	public static void main(String[] args) {
		Book gameOfThrones= new Book("George Martin","Game Of Thrones","Fantasy",900);
		Book mathBook= new Book("James Stewart","Calculus","Math",800);
		Book javaBook= new Book("Joel Muruach","Muruach's Java Programming","Programming",700);
		
// 		printBooks(gameOfThrones);
// 		printBooks(mathBook);
// 		printBooks(javaBook);
		
		gameOfThrones.printBooks(); //withought passing parameter, it is calling on object.
		mathBook.printBooks();
		javaBook.printBooks();
	}
	
// 	public static void printBooks(Book book){
// 	    System.out.println("The Book "+book.getTitle()+" written by "+book.getAuthor()+" has "+book.getNumPages()+" Pages "+" and it genre is "+book.getGenre());
// 	    System.out.println();
// 	}
}
