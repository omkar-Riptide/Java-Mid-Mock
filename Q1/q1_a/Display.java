import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        System.out.print("Enter No. of student records:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();//************ 

        Student_info[] students=new Student_info[n];//////////NEW

        String name;
        int id;
        float s1,s2,s3;
        for(int i=0;i<n;i++){
            System.out.print("\nENter student "+i+" details:\n");
            
            System.out.print("Enter name:");
            name=sc.nextLine();

            System.out.print("Enter id:");
            id=sc.nextInt();

            System.out.print("Enter subject 1 marks:");
            s1=sc.nextFloat();
            System.out.print("Enter subject 2 marks:");
            s2=sc.nextFloat();
            System.out.print("Enter subject 3 marks:");
            s3=sc.nextFloat();

            students[i]=new Student_info(id,name,s1,s2,s3);

            sc.nextLine();//****************** 
        }
        System.out.print("\n========Marksheet========\n");
        for(int i=0;i<n;i++){
            System.out.print("\nStudent "+i+"\n");
            students[i].grading();
            System.out.println("\n");
        }
    }
}

// A cleaner approach is to use sc.nextLine() consistently and convert numbers, 
// but for your current code, you can simply put:

// sc.nextLine();

// after every nextInt(), nextFloat(), etc. when you are about to use nextLine() next.