// Create an ArrayList<Employee> where Employee contains employee ID, name, and salary.
// Perform the following operations:
// 1.	Add at least five employees.
// 2.	Display employees having salary greater than ₹50,000.
// 3.	Search for an employee using ID.

//4.	Update an employee's salary.

import java.util.ArrayList;

public class Employee {
    public String name;
    public int id;
    private double salary;

    Employee(String name,int id,double salary){
        this.id=id;this.name=name;this.salary=salary;
    }

    void display(){
        System.out.print("\nEmployee name:"+name);
        System.out.print("\nEmployee id:"+id);
        System.out.print("\nEmployee salary:"+salary);
    }
    double getsalary(){return salary;}
    void setsalary(double new_sal){salary=new_sal;}

    // void search_idc(ArrayList<Employee> arr,int find_id){
    //     for(Employee e:arr){
    //         if(e.id==find_id){
    //             System.out.print("\nEMployee found!\nDetils.....\n");
    //             e.display();
    //             break;
    //         }
    //     }
    // }

    // void filter_emp(ArrayList<Employee> arr){
    //     System.out.print("\nEmpoyees with salary less than 50000\n");
    //     for(Employee e:arr){
    //         if(e.getsalary()<50000){
    //             e.display();
    //         }
    //     }
    // }


    
}
