import Model.Result;
import Model.Student;

class Main {
    public static void main(String[] args) {
        // create students
        Student student1 = new Student("abs", 1, 85.5);
        Student student2 = new Student("def", 2, 92.0);
        Student student3 = new Student("ghi", 3, 75.0);

        // create result object
        Result result = new Result();

        // add students to result
        result.addStudent(student1);
        result.addStudent(student2);
        result.addStudent(student3);

        // display result
        result.displayResult();
    }
}