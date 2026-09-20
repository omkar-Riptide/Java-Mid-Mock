
// Q18. Synchronized Bank Withdrawal
// Create a BankAccount class with an initial balance.
// Create two threads representing two customers attempting to withdraw money 
// from the same account simultaneously.
// Implement withdraw() as a synchronized method.
// The program should ensure that the account balance never becomes negative

public class BankAccount {
    private double balance=185;
    public synchronized void withdraw(double ammount){
        if((balance-ammount)<0){
            System.out.print("Cant complete anymore transactions!");
            return;}
        balance-=ammount;
    }    
    double getBalance(){return balance;}
}
