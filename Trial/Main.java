
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int id;String name;double salary;String dept;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id:");
        id=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name:");
        name=sc.nextLine();

        System.out.print("Enter dept:");
        dept=sc.nextLine();

        System.out.print("Enter salary:");
        salary=sc.nextDouble();

        Employee e=new Employee(id, name, dept, salary);
        System.out.print(e);
    }
    
}
