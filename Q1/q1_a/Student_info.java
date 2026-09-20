// Q1. Student Result Management
// Create a Student class containing roll number, name, and marks of three subjects. Implement
// methods to calculate total and percentage and display the result.
 public class Student_info {
    public int id;
    public String name;
    public float s1,s2,s3,temp;

    Student_info(int id,String name,float s1,float s2,float s3){
        this.id=id;this.name=name;this.s1=s1;
        this.s2=s2;this.s3=s3;
    }
    void grading(){
        System.out.print("Total marks:"+(s1+s2+s3)+"\n");
        temp=(s1+s2+s3)/300;
        System.out.print("Percentage obtained:"+(temp*100)+"\n");
    }

}
