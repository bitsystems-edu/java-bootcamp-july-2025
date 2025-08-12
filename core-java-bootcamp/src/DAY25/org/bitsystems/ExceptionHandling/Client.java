package DAY25.org.bitsystems.ExceptionHandling;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws MyCustomException {
        ExceptionHandling expHandling = new ExceptionHandling();
        System.out.println("===============================");
       // expHandling.case1(10, 0);
        try {
            expHandling.case2();
        } catch (FileNotFoundException e) {
          //  throw new RuntimeException(e);
            System.out.println("File is not available at specified Location");
        }

        try {
            expHandling.callingUserDefinedExp();
        } catch (MyCustomException e) {
          //  throw new MyCustomException("This is my own exception");
            System.out.println("My Exception: "+e);
        }
        System.out.println("===============================");
    }
}