package DAY14.org.bitsystems.methods;

import java.util.Scanner;

/*
 Write a program in java to check if given number is Armstrong number or not.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("============== RESULT ==============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check if it in Armstrong number or not");
        int number = sc.nextInt();

        armstrong(number);
    }
    // Step 1 - Count the total digit in given number let say totalDigits.

    public static void armstrong(int num) {
        int totalDigits = 0;
        int originalValue = num;
        int tempValue = num;
        int armstrongNumber = 0;

        while(num != 0) {
            int tem = num % 10;
            //totalDigits = totalDigits +1;
            totalDigits += 1;
            num /=10;
        }
        //System.out.println("Num value: " + num);
        // Step 2 - Raise each digit of the number to the power totalDigits.

        while(tempValue != 0) {
            int temp = tempValue % 10;

            // Step 3 - Sum all value in step 2.
            armstrongNumber += powerFunction(temp,totalDigits);
            tempValue /=10;
        }

        // Step 4 - Check if sum is equal to the original number.
        // Step 5 - if yes, number is Armstrong Number else Not.

        if(armstrongNumber ==  originalValue) {
            System.out.println(originalValue + " is an Armstrong Number");
        }else {
            System.out.println(originalValue +" is not an Armstron number");
        }
    }
    public static int powerFunction(int base, int exp) {
        int power = 1;
        for(int i = 1; i<= exp; i++) {
            power = power * base;
        }
        return power;
    }
}
