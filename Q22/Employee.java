// Q22. Employee Data Processing Using Java 8
// Create an ArrayList<Employee> containing employee ID, name, department, and salary.
// Using Stream API and lambda expressions:
// 1.	Display employees belonging to the "IT" department.
// 2.	Display employees having salary greater than ₹50,000.
// 3.	Find the employee with the highest salary.
// 4.	Calculate the average salary.
// 5.	Use a method reference to display employee details.



public class Employee {
    public int id;public String name;
    public String dept;public double salary;

    Employee(int id,String name,String dept,double salary){
        this.id=id;this.name=name;this.dept=dept;this.salary=salary;
    }
    public String toString(){
        return "{Employee name:"+name+",ID:"+id+",Department:"+dept+",Salary:"+salary+"}";

    }

    
}