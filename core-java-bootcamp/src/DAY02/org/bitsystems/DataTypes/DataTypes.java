package DAY02.org.bitsystems.DataTypes;


public class DataTypes {
    public static void main(String[] args) {

        boolean isActive = false;
        System.out.println("Boolean Value: "+isActive);

        byte byteValue = 127;
        System.out.println("Byte Value: " + byteValue);

        short shortValue = 128;
        System.out.println("Short Value: " + shortValue);

        int intValue = 345644564;
        System.out.println("Int Value: " + intValue);

        long longValue = 345644545645642L;
        System.out.println("Long Value: " + longValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum value of Integer: "+ minValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum value of Integer: "+ maxValue);

        float floatValue = 25.203F;
        System.out.println("Float Value: " + floatValue);

        double doubleValue = 25.203d;
        System.out.println("double Value: " + doubleValue);

        float a = 10f;
        float b = 6f;
        float c = a/b;
        System.out.println("Float Range: " + c);

        double aa = 10d;
        double bb = 6d;
        double cc = a/b;
        System.out.println("Double Range: " + cc);

        char charValue = 'a';
        System.out.println("Char Value : " + charValue);

    }
}
