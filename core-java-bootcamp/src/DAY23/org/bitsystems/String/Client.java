package DAY23.org.bitsystems.String;

public class Client {
    public static void main(String[] args) {
        StringExample strExmaple = new StringExample();
        strExmaple.StringMethods(" Lets see  ");

        String newString = strExmaple.reverseString("Hello");
        System.out.println("New Reversed String is " + newString);

    }
}
