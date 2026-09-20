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
