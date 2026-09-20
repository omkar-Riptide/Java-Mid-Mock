
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int id,search_id,return_id;
        String name,author;
        boolean status;

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of books:");
        n=sc.nextInt();

        Book[] books=new Book[n];
        System.out.print("Enter book log....\n");
        for(int i=0;i<n;i++){
            System.out.print("Enter book id:");
            id=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter book name:");
            name=sc.nextLine();
            System.out.print("Enter author name:");
            author=sc.nextLine();
            // System.out.print("Enter availability status:");
            // status=sc.nextBoolean();

            Book books[i]=new Book(id, name, author);
        }
        BookManagement bm;
        //display log
        for(int i=0;i<n;i++){
            books[i].display();
        }
        try{
            System.out.print("Enter search id:");
            search_id=sc.nextInt();
            bm.issueBook(books, n, search_id);
        }
        catch(bookIssued e){
            System.out.print(e.getMessage());
        }
    }
}
