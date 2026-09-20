
import  java.util.*;
//import java.util.Scannner;->>>>>INCLUDED IN import  java.util.*;

// Accept student roll numbers and store them in a HashSet<Integer>.
// Perform the following:
// 1.	Add at least eight roll numbers, including duplicates.
// 2.	Display only unique roll numbers.
// 3.	Search for a particular roll number.
// 4.	Remove a roll number.
// 5.	Display the final set.

public class Mian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of id's:");
        int n=sc.nextInt();
        HashSet<Integer> rolls=new HashSet<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter element number "+(i+1)+"\t");
            int num=sc.nextInt();
            rolls.add(num);
        }
        for(Integer roll:rolls){
            System.out.print(roll+" ");
        }
        System.out.print("Enter roll umber to be searched:");
        int search=sc.nextInt();
        boolean status=false;
        for(Integer roll:rolls){
            if(search==roll){
                System.out.print("Found!");
                status=true;
                break;
            }
            // else{
            //     System.out.print("Number not found!");
            // }
        }
        if(status==false){System.out.print("\nElement not found!\n");}

        System.out.print("\n\nEnter roll umber to be deleted:");
        int del=sc.nextInt();
        rolls.remove(del);
        System.out.print(del+" removed!New set:\n");
        for(Integer roll:rolls){
            System.out.print(roll+" ");
        }//final set displayed
    }
    
}
