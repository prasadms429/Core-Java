public class BankAccount{
    private String owner;
    private int balance;
    
    public BankAccount(String owner){
        this(owner,0);
    }
    public BankAccount(String owner, int balance){
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
        }
        else{
            System.out.println("Amount to deposit must be greater than zero");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && balance>=amount){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount to withdraw must be greater than zero and less than balance");
        }
    }
    
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}
