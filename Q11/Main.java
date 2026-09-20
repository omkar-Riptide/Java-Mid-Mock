// Perform the following operations:
// 1.	Add at least five employees.
// 2.	Display employees having salary greater than ₹50,000.
// 3.	Search for an employee using ID.
// 4.	Update an employee's salary.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Operation op=new Operation();
        ArrayList<Employee> employees=new ArrayList<>();
        Employee e1=new Employee("Omkar Kinkar", 100, 120000.5);
        Employee e2=new Employee("ABC", 101, 12000.5);
        Employee e3=new Employee("XYZ", 103, 15700.5);
        Employee e4=new Employee("PQR", 104, 1248009.5);
        Employee e5=new Employee("CDF", 105, 12300.5);

        employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);employees.add(e5);
        //e1.display();e2.display();e3.display();e4.display();e5.display();

        for(Employee e:employees){e.display();}

        e3.setsalary(21000);
        for(Employee e:employees){e.display();}

        op.search_idc(employees, 103);
        op.filter_emp(employees);

    }
    
}

//EVERYTHING FINE EVEN IF CONSTRUCTOR IS SHOWING UNDEFINED!!!!
