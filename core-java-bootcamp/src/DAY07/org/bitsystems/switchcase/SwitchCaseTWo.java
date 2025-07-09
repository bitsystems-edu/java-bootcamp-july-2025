package DAY07.org.bitsystems.switchcase;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseTWo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter number: ");
    String number = sc.nextLine();
    //char d = 'ss';

    //    A ->a;
        switch (number.toLowerCase()) {
//            case "A":
//                System.out.println("You entered A");
//                break;
            case "a":
                System.out.println("You entered A");
                break;
//            case "B":
//                System.out.println("You entered B");
//                break;
            case "b":
                System.out.println("You entered B");
                break;

            default:
                System.out.println("Enter valid String");
        }
    }
}
