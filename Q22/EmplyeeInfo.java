// Q22. Employee Data Processing Using Java 8
// Create an ArrayList<Employee> containing employee ID, name, department, and salary.
// Using Stream API and lambda expressions:
// 1.	Display employees belonging to the "IT" department.
// 2.	Display employees having salary greater than ₹50,000.
// 3.	Find the employee with the highest salary.
// 4.	Calculate the average salary.
// 5.	Use a method reference to display employee details.
import java.util.*;

public class EmplyeeInfo {
    public static void main(String[] args) {
        
    
    ArrayList<Employee> emp=new ArrayList<>();
    emp.add(new Employee(101,"Omkar Kinkar","IT",175000.0));
    emp.add(new Employee(102,"Percy Jackson","CE",75000.0));
    emp.add(new Employee(103,"Ryland Grace","AES",1175000.0));
    emp.add(new Employee(104,"Harry Potter","IT",15000.0));

    System.out.println("All Emplyee details");
    emp.stream()
        .forEach(System.out::println); 
    

    System.out.println("\nEmployees in IT dept:");
    emp.stream()
        .filter(em->em.dept.equals("IT"))
        .forEach(System.out::println); 
    
    System.out.println("\nEmpoyees with salary>50000");
    emp.stream()
        .filter(em->em.salary>50000)
        .forEach(System.out::println);
    
    System.out.println("\nEmpoyees with MAX salary:");
    // emp.stream()
    //     .mapToDouble(em->em.salary)
    //     .max()
    //     .ifPresent(System.out::println); //PRINTS JUST THE MAX SALARY AMT.
                                            //NOT THE EMPLYEE WITH MAX SALARY

    emp.stream()
        .max(Comparator.comparingDouble(em -> em.salary))
        .ifPresent(System.out::println);
    
    

    System.out.println("\nAverage salary:");
    emp.stream()
    .mapToDouble(em -> em.salary)
    .average()
    .ifPresent(System.out::println);

    }
}
