// Q2. Bank Account with Exception Handling
// Create a BankAccount class with account number, holder name, and balance. 
// Implement deposit() and withdraw() methods.
// If the withdrawal amount is greater than the available balance,
//  throw a user-defined InsufficientBalanceException.
// Handle the exception appropriately and display the final balance.
public class BankAccount {
    public int number;
    private String name;
    private float balance=10000;

    public void deposit(float amount){
        balance+=amount;
    }
    public void withdraw(float amount){
        balance-=amount;
    }
    float getBalance(){return balance;}

    public void display(){
        System.out.print("\nAccount holder name:"+name);
        System.out.print("\nAccount number:"+number);
        System.out.print("\nBalance:"+balance+"\n");
    }
}
