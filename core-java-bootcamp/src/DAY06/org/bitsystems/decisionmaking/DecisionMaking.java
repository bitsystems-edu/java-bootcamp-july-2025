package DAY06.org.bitsystems.decisionmaking;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        // ask input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number for validation: ");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Given number " + number + " is Even !");
        }else {
            System.out.println("Given number " + number + " is Odd !");
        }

        // Using Ternary Operator:
        String oddEven = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Given number " + number + " is - " + oddEven);

    }
}
