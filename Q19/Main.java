
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(48);
        numbers.add(60);
        numbers.add(75);
        numbers.add(90);

        System.out.println("All numbers:");
        numbers.forEach(x -> System.out.println(x));

        System.out.println("\nEven numbers:");
        numbers.forEach(x -> {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        });

        System.out.println("\nNumbers greater than 50:");
        numbers.forEach(x -> {
            if (x > 50) {
                System.out.println(x);
            }
        });

        System.out.println("\nUsing method reference:");
        numbers.forEach(System.out::println);
    }
}
