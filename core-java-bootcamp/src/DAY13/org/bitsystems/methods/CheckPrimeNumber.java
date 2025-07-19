package DAY13.org.bitsystems.methods;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        checkPrime(41);
        boolean isPrime = isPrime(41);
        if(isPrime) {
            System.out.println( " given number is not a prime number");
        } else {
            System.out.println( " Given number is a prime number");
        }
    }

    public static boolean isPrime(int N) {
        boolean divisibleByOtherNumber = false;
        // if(N <= 1) {
        if (N == 0 || N == 1) {
            System.out.println(N + " is not a prime number");
            return false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    divisibleByOtherNumber = true;
                    // System.out.println(N + " is not a prime number");
                    break;
                }
            }
        return divisibleByOtherNumber;
        }
    }

    public static void checkPrime(int N) {
        boolean divisibleByOtherNumber = false;
        // if(N <= 1) {
        if (N == 0 || N == 1) {
            System.out.println(N + " is not a prime number");
            return;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    divisibleByOtherNumber = true;
                   // System.out.println(N + " is not a prime number");
                    break;
                }
            }
            if(divisibleByOtherNumber) {
                 System.out.println(N + " is not a prime number");
            } else {
                 System.out.println(N + " is a prime number");
            }
        }
    }
}
