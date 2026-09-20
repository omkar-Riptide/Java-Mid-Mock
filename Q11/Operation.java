import java.util.ArrayList;

public class Operation {
        void search_idc(ArrayList<Employee> arr,int find_id){
        for(Employee e:arr){
            if(e.id==find_id){
                System.out.print("\nEMployee found!\nDetils.....\n");
                e.display();
                return;
            }
        }
        System.out.print("\nEmpoyee not found\n");
    }

    void filter_emp(ArrayList<Employee> arr){
        System.out.print("\nEmpoyees with salary greater than 50000\n");
        for(Employee e:arr){
            if(e.getsalary()>50000){
                e.display();
            }
        }
    }
}
