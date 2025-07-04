package DAY04.org.bitsystems.operators;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("--------------------------");
        int result = a++ + ++a + a++ + ++a + ++a + ++a + a++ + a++; //79
                     //10 + 12 + 12 + 14  + 15 + 16 + 16 + 17
        System.out.println("Final Result: "+result);

        System.out.println("--------------------------");

        int b = 20;
        int result2 = --b - --b - b++ + --b - --b; // -16
                     //19 - 18  - 18  + 18 - 17
        System.out.println("Result 2 : " + result2);
        System.out.println("--------------------------");

        int c = 20;
        int d = 10;
        int result3 = c++ + --c + ++d - --c + ++d + ++c - --d; // 53
                    // 20 + 20  + 11 - 19   + 12  + 20  - 11
        System.out.println("Result 3 : " + result3);
        System.out.println("--------------------------");

        int x = 10;
        int y = 6;
        int result4 = ++x - --x + x++ + y++ - ++y;
        System.out.println("result 4 : "+ result4);
        System.out.println("--------------------------");

//        System.out.println(a+b); //15
//        System.out.println(a-b); //5
//        System.out.println(a/b); //2
//        System.out.println(a*b); //50
//        System.out.println(a%b); //0

    }
}
