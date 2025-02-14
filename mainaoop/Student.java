//ANDERSON MAINA 
// CT 101/G/20948/23
//THIS PROGRAM USES FUNCTIONS TO ALLOCATE GRADE TO A STUDENT
import java.util.Scanner;
class Student {
    //DECLARE VARRIABLES WITH DATA TYPES
    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

//USE CONDITIONALS TO DETERMINE THE GRADE TO BE AWARDED
class GradeCalculator {  
    public static char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

public class MainApp { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ASK STUDENT TO ENTER NAME
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        //ASK STUDENT TO ENTER MARKS
        System.out.print("Enter student's marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);
        student.displayDetails();

        char grade = GradeCalculator.calculateGrade(marks); 
        System.out.println("Grade: " + grade);
        //CLOSING SCANNER
        scanner.close(); 
    }
}