// Create a base class Employee containing employee ID, name, and basic salary.
// Create two derived classes: Manager and Developer
// Override a method calculateSalary() to calculate the salary differently for each employee type.
// Create objects of both classes and display their salary details.



public class Employee {
    private int id;
    private String name;
    protected float base_salary;//made protected cuz class Manger and Dev need it

    Employee(int id,String name,float base_salary){
        this.id=id;
        this.name=name;
        this.base_salary=base_salary;
    }

    void calculateSalary(){
        System.out.print("\nEmployee name:"+name);
        System.out.print("\nEmployee id:"+id);
        System.out.print("\nEmployee base salary:"+base_salary);
    }

}

// class Manager extends Employee{
//     private float man_salary;
//     Manager(int id,String name,float base_salary,float man_salary){
//         super(id, name, base_salary);
//         this.man_salary=man_salary;
//     }
//     @Override 
//     void calculateSalary(){
//         super.calculateSalary();
//         System.out.print("\nTotal manager salary(Manager+Emp):"+(base_salary+man_salary));
//     }
// }

// class Developer extends Employee{
//     private float dev_salary;
//     Developer(int id,String name,float base_salary,float dev_salary){
//         super(id, name, base_salary);
//         this.dev_salary=dev_salary;
//     }
//     @Override 
//     void calculateSalary(){
//         super.calculateSalary();
//         System.out.print("\nTotal Developer salary(Manager+Emp):"+(base_salary+dev_salary));
//     }
// }
