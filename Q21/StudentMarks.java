 
import java.util.ArrayList;
import java.util.OptionalInt;

public class StudentMarks {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(91);
        marks.add(64);
        marks.add(78);
        marks.add(55);
        marks.add(88);
        marks.add(69);
        marks.add(95);
        marks.add(73);

        System.out.println("Marks greater than 60:");
        marks.stream()
             .filter(mark -> mark > 60)
             .forEach(System.out::println);

        OptionalInt highest = marks.stream()
                                   .mapToInt(Integer::intValue)
                                   .max();

        OptionalInt lowest = marks.stream()
                                  .mapToInt(Integer::intValue)
                                  .min();

        double average = marks.stream()
                              .mapToInt(Integer::intValue)
                              .average()
                              .orElse(0.0);

        long count = marks.stream()
                          .filter(mark -> mark > 75)
                          .count();

        System.out.println("Highest mark: " + highest.getAsInt());
        System.out.println("Lowest mark: " + lowest.getAsInt());
        System.out.println("Average: " + average);
        System.out.println("Students scoring more than 75: " + count);
    }
}
