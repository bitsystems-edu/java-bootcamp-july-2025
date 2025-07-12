package DAY09.org.bitsystems.flowcontrol;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter base: ");
        int base = sc.nextInt();

        System.out.println("Please Enter exponent: ");
        int exponent = sc.nextInt();
        int power = 1;

        for (int i = 1; i<=exponent; i++) {
            power = power * base;
        }
        System.out.println(base +" raised to the power " + exponent +" is : "+power);
    }
}
