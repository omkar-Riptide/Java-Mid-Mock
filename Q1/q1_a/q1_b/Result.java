

//everything same as the a part just this additional file
public interface Result {
    void calculateGrade();
}

So the structure is:

Interface → Result → calculateGrade()

Class → Student implements Result → provides calculateGrade()

Main → creates Student[] → calls grading()