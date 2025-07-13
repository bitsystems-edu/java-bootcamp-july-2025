package DAY10.org.bitsystems.nestedloops;

/*
A loop inside another loop is known as nested loop
 */

public class NestedLoops {
    public static void main(String[] args) {
        int N = 4;
        for(int i = 1; i<=4; i++) {  // outer loop
            for(int j = 1; j<=N; j++) { // Inner Loop
                System.out.print("Hello ");
            }
        }
    }
}
