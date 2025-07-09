package DAY07.org.bitsystems.switchcase;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            default:
                System.out.println("Enter valid number from 1 to 4");
        }

    }
}
