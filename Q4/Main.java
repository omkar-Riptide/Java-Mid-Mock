import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle
        double radius;

        do {
            System.out.print("Enter radius of circle: ");
            radius = sc.nextDouble();

            if (radius <= 0)
                System.out.println("Radius must be positive.");

        } while (radius <= 0);

        // Rectangle
        double length, breadth;

        do {
            System.out.print("Enter length of rectangle: ");
            length = sc.nextDouble();

            System.out.print("Enter breadth of rectangle: ");
            breadth = sc.nextDouble();

            if (length <= 0 || breadth <= 0)
                System.out.println("Length and breadth must be positive.");

        } while (length <= 0 || breadth <= 0);

        // Triangle
        double side1, side2, side3;

        do {
            System.out.print("Enter three sides of triangle: ");
            side1 = sc.nextDouble();
            side2 = sc.nextDouble();
            side3 = sc.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("All sides must be positive.");
            }
            else if (side1 + side2 <= side3 ||
                     side1 + side3 <= side2 ||
                     side2 + side3 <= side1) {
                System.out.println("Invalid triangle sides.");
            }
            else {
                break;
            }

        } while (true);

        // Runtime polymorphism
        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(length, breadth);
        Shape triangle = new Triangle(side1, side2, side3);

        System.out.println("\n--- Shape Details ---");

        System.out.println("Circle");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Find maximum area
        Shape maxShape = circle;

        if (rectangle.calculateArea() > maxShape.calculateArea())
            maxShape = rectangle;

        if (triangle.calculateArea() > maxShape.calculateArea())
            maxShape = triangle;

        System.out.println("\nMaximum Area: " + maxShape.calculateArea());

        if (maxShape == circle)
            System.out.println("Shape with maximum area: Circle");
        else if (maxShape == rectangle)
            System.out.println("Shape with maximum area: Rectangle");
        else
            System.out.println("Shape with maximum area: Triangle");

        sc.close();
    }
}