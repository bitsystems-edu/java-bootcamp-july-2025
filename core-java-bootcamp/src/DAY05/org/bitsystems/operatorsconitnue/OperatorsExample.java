package DAY05.org.bitsystems.operatorsconitnue;

public class OperatorsExample {
    public static void main(String[] args) {

        /*
        Relational Operators
         */
        System.out.println("---------------------------------");
        int a = 12;
        int b = 5;

        boolean equals = (a == b);
        System.out.println("Equals Operator: "+equals); // false

        boolean lessThan = (a < b);
        System.out.println("lessThan Operator: "+lessThan); //fasle

        boolean greaterThan = (a > b);
        System.out.println("lessThan Operator: "+greaterThan); // true

        boolean lessThanEqualto = (a <= b);
        System.out.println("lessThanEqualto Operator: "+lessThanEqualto); //false

        boolean greaterThanEqualto = (a >= b);
        System.out.println("greaterThanEqualto Operator: "+greaterThanEqualto); //true



        System.out.println("------------Logical Operator----------");

        /* &&, ||, !    */

       // boolean logicalAnd = ((a == b) && (a > b));
        boolean logicalAnd = ((equals) && (greaterThan));
        System.out.println( " Logical AND: "+ logicalAnd); //false

        boolean logicalOR = ((lessThan) || (greaterThanEqualto));
        System.out.println( " Logical OR: "+ logicalOR); //true

        boolean logicalNOT = (!greaterThan);
        System.out.println( " Logical NOT: "+ logicalNOT); //false

        System.out.println("----------------Bitwise Operator -----------------");

        int x = 7;
        int y = 5;

        int bitwiseAnd = (x & y);
        int bitwiseOr = (x | y);
        int bitwiseXor = (x ^ y);

        System.out.println("Bitwise AND: " + bitwiseAnd); // 5
        System.out.println("Bitwise OR: " + bitwiseOr);   // 7
        System.out.println("Bitwise XOR: " + bitwiseXor); // 2

    }
}
