class Manager extends Employee{
    private float man_salary;
    Manager(int id,String name,float base_salary,float man_salary){
        super(id, name, base_salary);
        this.man_salary=man_salary;
    }
    @Override 
    void calculateSalary(){
        System.out.print("\n==========Manager===========\n");
        super.calculateSalary();
        System.out.print("\nTotal manager salary(Manager+Emp):"+(base_salary+man_salary));
    }
}
