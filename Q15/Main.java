import java.util.*;

class NumberThread extends Thread {
    private int[] arr;

    NumberThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int sum = 0;

        System.out.println("Even numbers:");

        for (int num : arr) {
            sum += num;

            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nSum of all elements: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 7, 8, 13};

        NumberThread t = new NumberThread(arr);

        t.start();
    }
}
