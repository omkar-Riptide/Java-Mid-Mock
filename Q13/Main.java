// Q13. Student Marks Using HashMap
// Create a HashMap<Integer, Integer> where the key represents a student roll 
// number and the value represents marks.
// Perform the following:
// 1.	Add five student records.
// 2.	Display all records.
// 3.	Search marks using roll number.
// 4.	Update marks.
// 5.	Find and display the student having the highest marks.
import java.util.*;

public class Main {
    public static void main(String[] args) {    
    HashMap<Integer,Integer> records=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of student records:");
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
        System.out.print("\n\nEnter student "+(i+1)+" info:\n");
        System.out.print("Enter student roll:");
        int roll=sc.nextInt();
        System.out.print("Enter student marks:");
        int marks=sc.nextInt();

        records.put(roll,marks);
    }
    for(Integer r:records.keySet()){
        System.out.print("\n");
        System.out.print(r+" "+records.get(r));
    }

    System.out.print("\n\n");

    System.out.print("Enter record roll no. to be searched:");
    int search_id=sc.nextInt();
    boolean found=false;
    for(Integer roll:records.keySet()){
        if(roll==search_id){
            System.out.print("\nRecord found!\n");
            System.out.print(roll+" "+records.get(roll));
            found=true;
            break;
        }
    }
    if(found==false){System.out.println("Record not found!\n");}

    System.out.print("Enter roll num whose marks are to be updated:");
    int upd=sc.nextInt();
    System.out.print("Enter modified marks:");
    int mod_marks=sc.nextInt();
    records.put(upd,mod_marks);
    System.out.print("\n\nModified records:\n");
    for(Integer ro:records.keySet()){
        System.out.print("\n");
        System.out.print(ro+" "+records.get(ro));
    }
    
    System.out.print("\n\n");
}
   
    
}

