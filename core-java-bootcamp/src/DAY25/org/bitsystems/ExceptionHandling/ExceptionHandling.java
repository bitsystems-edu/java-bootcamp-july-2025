package DAY25.org.bitsystems.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 Exception:
  -
 Exception Handling:
  -
 */
public class ExceptionHandling {
    public void case1(int a, int b) {
//        if((a != 0) && (b != 0)) {
            try{
                int result = a / b;
                System.out.println("Result of Case 1 : " + result);
            }catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception : " + ae);
            }catch (RuntimeException re) {
                System.out.println("Run Time Exception: "+re);
            }catch (Exception e) {
                System.out.println("Exception occured : " + e);
            }
        }
//        } else {
//            System.out.println("Invalid Input, please retry entering valid inputs");
//        }
//   }

    // Throw and Throws
    public void case2() throws FileNotFoundException {
        FileReader fr = new FileReader("test.txt");
        System.out.println("Reading a file");

    }
    public void callingUserDefinedExp() throws MyCustomException {
       throw new MyCustomException("Throwing my own exception");
    }
}