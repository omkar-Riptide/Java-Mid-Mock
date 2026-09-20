// Q8. Vehicle Management System
// Create a base class Vehicle with registration number, brand, and speed.
// Create two subclasses Car and Bike.
// Override a method displayDetails() in both subclasses. Use a common reference of 
// the parent class to invoke the overridden methods

public class Car extends Vehicle{
    public int wheels;
    Car(int reg_num,String brand,float speed,int wheels){
        super(reg_num, brand, speed);
        this.wheels=wheels;
    }
    @Override 
    void displayDetails(){
        super.displayDetails();
        System.out.print("No. of wheels on car:"+wheels);
        System.out.print("\n");
    }    
}
