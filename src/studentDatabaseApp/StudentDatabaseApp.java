package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // no of students
        System.out.println("Enter the number of students to be enrolled: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
