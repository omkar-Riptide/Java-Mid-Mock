
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        float base_salary;   float man_salary;    float dev_salary;
        System.out.print("Enter Manger details:\n");
        System.out.print("Enter Manager id:");
        id=sc.nextInt();
        sc.nextLine();       // consume leftover newline======PERFECTO==========
        System.out.print("Enter Manger name:");
        name=sc.nextLine();
        System.out.print("Enter manager base salary:");
        base_salary=sc.nextFloat();
        System.out.print("Enter Manger additional salary:");
        man_salary=sc.nextFloat();

        Manager m=new Manager(id, name, base_salary, man_salary);
////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter Developer details:\n");
        System.out.print("Enter Developer id:");
        id=sc.nextInt();
        sc.nextLine();       // consume leftover newline======PERFECTO==========

        System.out.print("Enter Developer name:");
        name=sc.nextLine();
        System.out.print("Enter Developer base salary:");
        base_salary=sc.nextFloat();
        System.out.print("Enter Developer additional salary:");
        dev_salary=sc.nextFloat();

        Developer d=new Developer(id, name, base_salary, dev_salary);
////////////////////////////////////////////////////////////////////////
        m.calculateSalary();
        System.out.print("\n");
        d.calculateSalary();
    }
}
