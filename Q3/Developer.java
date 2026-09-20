class Developer extends Employee{
    private float dev_salary;
    Developer(int id,String name,float base_salary,float dev_salary){
        super(id, name, base_salary);
        this.dev_salary=dev_salary;
    }
    @Override 
    void calculateSalary(){
        System.out.print("\n==========Developer===========\n");
        super.calculateSalary();
        System.out.print("\nTotal Developer salary(Manager+Emp):"+(base_salary+dev_salary));
    }
}
