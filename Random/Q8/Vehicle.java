// Create a base class Vehicle with registration number, brand, and speed.
// Create two subclasses Car and Bike.
// Override a method displayDetails() in both subclasses. Use a common 
// reference of the parent class to invoke the overridden methods.


public class Vehicle {
    public int number;
    public String brand;
    public double speed;

    Vehicle(int number,String brand,double speed){
        this.number=number;this.speed=speed;this.brand=brand;
    }
    void displayDetails(){
        System.out.println("Vehicle regi number:"+number);
        System.out.println("Veehicle brand:"+brand);
        System.out.println("Vehicle speed:"+speed);
    }


    
}
