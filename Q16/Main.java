

class StudentProcessor implements Runnable {

    private int[] marks;

    // Constructor
    StudentProcessor(int[] marks) {
        this.marks = marks;
    }

    // Overriding run() method of Runnable
    @Override
    public void run() {

        int sum = 0;

        // Calculate total marks
        for (int mark : marks) {
            sum += mark;
        }

        // Calculate average
        double average = (double) sum / marks.length;

        System.out.println("Average marks: " + average);

        // Display students scoring above average
        System.out.println("Students scoring above average:");

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                System.out.println("Student " + (i + 1) +
                                   ": " + marks[i]);
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        int[] marks = {65, 82, 74, 91, 58, 88};

        // Create Runnable object
        StudentProcessor task = new StudentProcessor(marks);

        // Create Thread object using Runnable
        Thread t = new Thread(task);

        // Start the thread
        t.start();
    }
}
