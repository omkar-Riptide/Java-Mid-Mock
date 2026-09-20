

public class Student implements Result {
    public int id;
    public String name;
    public float s1, s2, s3;

    Student(int id, String name, float s1, float s2, float s3) {
        this.id = id;
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    void grading() {
        float total = s1 + s2 + s3;
        float percentage = (total / 300) * 100;

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);

        calculateGrade();
    }

    public void calculateGrade() {//INTERFACE OVERRIDE Fn.
        float percentage = ((s1 + s2 + s3) / 300) * 100;

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 75)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}