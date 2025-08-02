package DAY13.org.bitsystems.methods;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(5);
    }
    public static void fibonacci(int N) {
        int first = 0;
        int second = 1;

        for(int i = 1; i<=N; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
