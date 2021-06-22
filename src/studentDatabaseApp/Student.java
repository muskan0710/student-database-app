package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private String studentId;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = sc.nextLine();
        System.out.print("1. Freshman\n2.Sophomore\n3.Junior\4.Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentId();
    }

    //generate student id
    private void setStudentId() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n-->" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment amount: $" + tuitionBalance);
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance + payment;
        System.out.println("Thank you for your payment of $" + payment);
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent Id: " + studentId +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
