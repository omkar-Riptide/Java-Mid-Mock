

public class CustomerThread extends Thread{
    private BankAccount khata;
    CustomerThread(BankAccount khata){this.khata=khata;}
    @Override
    public void run(){
        khata.withdraw(175);
    }   
}
