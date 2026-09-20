import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter marks:");
            marks=sc.nextInt();
            if(marks<0 || marks>100){
                throw new InvalidMarksException("Invalid Marks entered!");
            }
            Student s=new Student();
            s.setMarks(marks);
            s.display();
        }
        catch(InvalidMarksException e){
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("Execution complete!");
        }
    }
}
