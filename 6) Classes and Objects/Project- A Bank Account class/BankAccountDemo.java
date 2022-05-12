public class Main
{
	public static void main(String[] args) {
		BankAccount B1=new BankAccount("Raju");
		BankAccount B2=new BankAccount("Prasad",5000);
		
		B1.deposit(100);
		System.out.println("Owner: "+B1.getOwner());
		System.out.println("Balance: "+B1.getBalance());
		System.out.println();
		
		B1.withdraw(1000); // warning
		System.out.println("Owner: "+B1.getOwner());
		System.out.println("Balance: "+B1.getBalance());
		System.out.println();
		
		System.out.println("Owner: "+B2.getOwner());
		System.out.println("Balance: "+B2.getBalance());
		System.out.println();
		
		System.out.println("Deposit of 600 ?");
		B2.deposit(600);
		System.out.println("Owner: "+B2.getOwner());
		System.out.println("Balance: "+B2.getBalance());
	}
}
