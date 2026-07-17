import java.util.Scanner;

public class student_record {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Java: ");
        int java = scanner.nextInt();

        System.out.print("Enter marks in Python: ");
        int python = scanner.nextInt();

        System.out.print("Enter marks in Database: ");
        int database = scanner.nextInt();

        int total = java + python + database;
        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n----- Result -----");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);

        scanner.close();
    }
}g