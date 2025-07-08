package DAY06.org.bitsystems.decisionmaking;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter marks: ");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("Please enter valid marks");
            return;
        }
        if(marks <= 100 && marks >= 80) {
            System.out.println("GRADE-A");
        }
        else if(marks < 80 && marks >= 60) {
            System.out.println("GRADE-B");
        }
        else if(marks < 59 && marks >= 45) {
            System.out.println("GRADE-C");
        }
        else if(marks < 45 && marks >= 35) {
            System.out.println("GRADE-D");
        }
        else {
            System.out.println("You are not qualified !");
        }
    }
}
