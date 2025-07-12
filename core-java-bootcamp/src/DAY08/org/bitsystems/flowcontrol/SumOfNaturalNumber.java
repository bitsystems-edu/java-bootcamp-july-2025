package DAY08.org.bitsystems.flowcontrol;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number: ");
        int number = sc.nextInt();
        int sum = 0;

// ------- Iterative Way:
//        for(int i = 1; i<=number; i++) {
//            sum = sum + i;
//        }

// ------- Optimized way:
        sum = (number*(number+1))/2;
        System.out.println("Sum of first " +number+" natural numbers is "+sum);
    }
}
