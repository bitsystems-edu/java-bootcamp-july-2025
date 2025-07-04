package DAY03.org.bitsystems.TypingCasting;


public class TypingCasting {
    public static void main(String[] args) {
        int number = 2342323;
        long longNumber = number;
        System.out.println("Int to Long: "+longNumber);

        long newLongNumber = 345434543L;
        int newIntNumber = (int)newLongNumber;
        System.out.println("Long to int: " + newIntNumber);

        float floatNumber = 3.45f;
        int foatToInt = (int)floatNumber;
        System.out.println("Float to Int " + foatToInt);

//        double newNumber = 23.34;
//        System.out.println("Double value without D: "+newNumber);
//        int doubleToInt = (int)newNumber;
//        System.out.println("Double to Int " +doubleToInt);
//
//        // Implement type casting for Double to Int
//
//
//        int firstNumber = 1234;
//        int secondNumber = 56789;
//        int thirdValue = 12312;
//
//        System.out.println(firstNumber +" - "+secondNumber);
//        System.out.println("First Value: "+ firstNumber +" Second Value: "+secondNumber+ " ThirdValue: " +thirdValue);
    }
}

