package DAY10.org.bitsystems.nestedloops;

public class SquareStarPattern {
public static void main(String[] args) {
      int N = 4;
      // This is our outer loop which defined # of rows
        for(int i = 1; i<=4; i++) {
            // This is our inner loop which defined # of columns
            for(int j = 1; j<=N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
      }
}

