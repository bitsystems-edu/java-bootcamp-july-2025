package DAY09.org.bitsystems.flowcontrol;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number to find the reverse of : ");
        int number = sc.nextInt();
        int reverse = 0;

        while(number > 0)  {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            //number = number/10;
            number /= 10;
        }
        System.out.println("Reverse of given number is : " + reverse);

    }
}
