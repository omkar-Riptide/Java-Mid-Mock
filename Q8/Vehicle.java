// Q8. Vehicle Management System
// Create a base class Vehicle with registration number, brand, and speed.
// Create two subclasses Car and Bike.
// Override a method displayDetails() in both subclasses. Use a common reference of 
// the parent class to invoke the overridden methods

public class Vehicle {
    private int reg_num;
    public String brand;
    public float speed;

    Vehicle(int reg_num,String brand,float speed){
        this.reg_num=reg_num;
        this.brand=brand;
        this.speed=speed;
    }

    void displayDetails(){
        System.out.print("\n\nVehicle registration number:"+reg_num);
        System.out.print("\nVehicle brand:"+brand);
        System.out.print("\nVehicle average speed:"+speed);

    }
    
}
