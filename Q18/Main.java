
public class Main {
    public static void main(String[] args) throws InterruptedException{
        BankAccount khata=new BankAccount();
        CustomerThread t1=new CustomerThread(khata);
        CustomerThread t2=new CustomerThread(khata);

        t1.start();t2.start();

        t1.join();t2.join();

        System.out.print("Transactions completed,remaining balance:"+khata.getBalance());

    }
    
}
