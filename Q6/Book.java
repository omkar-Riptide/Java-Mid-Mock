

public class Book {
    public int id;
    public String name,author;
    public boolean status;
    Book(int id,String name,String author){
        this.name=name;
        this.id=id;
        this.author=author;
        status=true;
    }

    void display(){
        System.out.print("\n\nBook name:"+name);
        System.out.print("\nBook author:"+author);
        System.out.print("\nBook ID:"+id);
        System.out.print("\nBook Avalibilty status:"+status);
    }

    
}
