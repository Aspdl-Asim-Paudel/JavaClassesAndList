package Model;

import java.util.ArrayList;

class Result {
    private ArrayList<Student> students;

    // constructor
    public Result() {
        students = new ArrayList<Student>();
    }

    // method to add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // method to display result
    public void displayResult() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("-------------------");
        }
    }
}
