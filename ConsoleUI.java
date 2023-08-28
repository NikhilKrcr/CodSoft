import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManagementSystem sms = new StudentManagementSystem();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        sms.addStudent(new Student(name, rollNumber, grade));
        System.out.println("Student added!");
    }

    private static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayAllStudents() {
        List<Student> students = sms.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("All students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
