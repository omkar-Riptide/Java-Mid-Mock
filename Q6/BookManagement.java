

public class BookManagement {
    void issueBook(Book arr[],int n,int search_id){
        for(int i=0;i<n;i++){
            if(arr[i].status==false){
                throw new bookIssued("Book issued already!");
            }
            else{//arr[i].status is true
                arr[i].status=false;
                System.out.print("Book issued succesfully!");
                break;
            }
        }

    }
    void returnBook(Book arr[],int n,int return_id){
        for(int i=0;i<n;i++){
            if(return_id==arr[i].id){
                arr[i].status=true;
                System.out.print("Book returned succesfully!");
            }
        }
    }

}
