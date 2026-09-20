// Q2. Bank Account with Exception Handling
// Create a BankAccount class with account number, holder name, and balance. 
// Implement deposit() and withdraw() methods.
// If the withdrawal amount is greater than the available balance,
//  throw a user-defined InsufficientBalanceException.
// Handle the exception appropriately and display the final balance.
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        int choice;
        float deposit,withdraw;
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount();
        do{
        System.out.print("=====");
        System.out.print("1.Display\t2.Deposit\t3.Withdraw\t4.Exit\n");
        System.out.print("Enter choice:");
        choice=sc.nextInt();

        switch(choice){
            case 1:
                b.display();
                break;
            case 2:
                System.out.print("Enter deposit ammount:");
                deposit=sc.nextFloat();
                b.deposit(deposit);
                break;
            case 3:
                try{
                   System.out.print("Enterwithdrawal amount:");
                   withdraw=sc.nextFloat();
                   if(withdraw>b.getBalance()){throw new InsufficientBalaneException("Insufficient balance!");} 
                   else{b.withdraw(withdraw);}
                }
                catch(InsufficientBalaneException e){
                    System.out.print(e.getMessage());
                }
                break;
            case 4:
                System.out.print("Exiting!");
                break;
            default:
                System.out.print("Invalid choice!");
        }

        }while(choice!=4);
    }
    
}
//little galat,didnt take user name and id,but other working just fine!