package DAY12.org.bitsystems.methods;

public class MethodExample {
    public static void main(String[] args) {
        // Step 3 - Calling
        printMyName();
        printMyName("Java - using Parameter");
        System.out.println("Sum of given Values: "+getSumOfTwoNumbers(10, 15));

        int reversedValue = reverseNumber(54321);
        System.out.println("Reverse of given number is : "+reversedValue);
    }

    // Step 1 - Declaration
   public static void printMyName() {
       // Step2 - Definition
       System.out.println("Java");
    }

    // Step 1 - Declaration
    public static void printMyName(String name) {
        // Step2 - Definition
        System.out.println(name);
    }

   public static int getSumOfTwoNumbers(int a, int b) {
       int sum = 0;
       sum = a+b;
       return sum;
    }

   public static int reverseNumber(int number){
        // business Login
       int reverse = 0;

       while(number > 0)  {
           int temp = number % 10;
           reverse = reverse * 10 + temp;
           //number = number/10;
           number /= 10;
       }
       return reverse;
    }
}
