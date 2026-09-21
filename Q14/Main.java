// Q14. Product Inventory Using Collections
// Create a HashMap<Integer, Integer> to maintain product ID and available quantity.
// Implement methods to:
// •	Add products.
// •	Update product quantity.
// •	Search product availability.->if quantuty is less 0 declare it unavailable
// •	Remove a product.
// •	Display all products.
// Handle the case where a requested product ID does not exist.

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int id;int qty;
        Scanner sc=new Scanner(System.in);
        int choice;
        HashMap<Integer,Integer> items=new HashMap<>();
        do{
            System.out.print("1.Add item:\t2.Update product qty:\t3.Search product:" );
            System.out.print("4.Remove product:\t5.Display all products\t6.Exit\n");
            System.out.print("Enter choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter product id to be added:");id=sc.nextInt();
                    System.out.print("Enter quantity:");qty=sc.nextInt();
                    ////////
                    items.put(id,qty);
                    break;
                
                case 2:
                    System.out.print("Enter product whose qty is to be modified:");
                    int upd_id=sc.nextInt();
                    if(items.containsKey(upd_id)){
                        System.out.print("Enter new quantity:");
                        int upd_qty=sc.nextInt();
                        items.put(upd_id,upd_qty);
                    }
                    else{System.out.print("ID not found in records!");}
                    break;

                case 3:
                    System.out.print("Enter prod ID to see its availaibility:");
                    int search_id=sc.nextInt();
                    if(items.containsKey(search_id)){
                        int avail_qty=items.get(search_id);
                        if(avail_qty>0){System.out.print("Product available,in stock:"+avail_qty);}
                        else{System.out.print("Product out of stock!");}
                    }
                    else{System.out.print("ID not found in records!");}
                    break;

                case 4:
                    System.out.print("Enter product id to be removed:");
                    int del=sc.nextInt();
                    items.remove(del);
                    System.out.print("Product removed successfully!");
                    break;
            
                case 5:
                    System.out.print("Displaying all products:quantity....\n");
                    for(Integer i:items.keySet()){
                        System.out.println(i+":"+items.get(i));
                    }
                    break;
                
                case 6:
                    System.out.print("Exiting.....");
                    break;

                default:
                    System.out.print("nvalid choice!");

            }
        }while(choice!=6);
    }
}