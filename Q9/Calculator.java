
// Q9. Calculator with Exception Handling
// Create a Calculator class containing methods for addition, 
// subtraction, multiplication, and division.
// Accept two numbers from the user.
// Handle division by zero using exception handling. 
// Use finally to display a message indicating that the calculation is completed.

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a:");
        a=sc.nextInt();
        System.out.print("Enter b:");
        b=sc.nextInt();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        try{
        System.out.println("a/b="+(a/b));
        }
        catch(ArithmeticException e){
            System.out.print("Cant divide by zero!");
        }
        finally{
            System.out.print("Calculation completed!");
        }




    }

    
}
