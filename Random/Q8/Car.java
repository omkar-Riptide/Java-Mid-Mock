

public class Car extends Vehicle{
    public int numberOfWheels;
    Car(int number,String brand,double speed){
        super(number,brand,speed);
        numberOfWheels=4;
    }
    @Override 
    void displayDetails(){
        super.displayDetails();
        System.out.println("No. of Wheels"+numberOfWheels);

    }
    
}
