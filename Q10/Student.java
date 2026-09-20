
public class Student {
    private int marks;
    void setMarks(int x){marks=x;}
    void display(){
        System.out.print("Marks="+marks);
        grading();
    }
    void grading(){
        if(marks<=100 || marks>90){
            System.out.print("Grade A+");
        }
        else if(marks<=90 || marks>80){
            System.out.print("Grade A");
        }
        else if(marks<=80 || marks>70){
            System.out.print("Grade B");
        }
        else{
            System.out.print("Grade F");
        }
    }
}
