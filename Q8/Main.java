// Q8. Vehicle Management System
// Create a base class Vehicle with registration number, brand, and speed.
// Create two subclasses Car and Bike.
// Override a method displayDetails() in both subclasses. Use a common reference of 
// the parent class to invoke the overridden methods


public class Main {
    public static void main(String[] args) {
        Vehicle ref1=new Car(789,"Koinegsegg Demonz5",135.8f,4);
        Vehicle ref2=new Bike(981,"Ducati 780xW",99.8f,2);

        ref1.displayDetails();
        ref2.displayDetails();

    }
}
