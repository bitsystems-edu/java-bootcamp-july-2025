package DAY09.org.bitsystems.flowcontrol;

import java.util.Scanner;

public class ProductOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number to find the product of : ");
        int number = sc.nextInt();
        int product = 1;
     //    ------- Iterative Way:
        for(int i = 1; i<=number; i++) {
            product = product * i;
        }
        System.out.println("Product of first "+number+" is : " + product);
    }
}
