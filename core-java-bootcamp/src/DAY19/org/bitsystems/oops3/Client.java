package DAY19.org.bitsystems.oops3;


/*
CASE 1:
    Computer com = new Computer();
    System.out.println(com.ram);        // 16
    System.out.println(com.storage);    // 256
    System.out.println(com.myStorage);  // Compile Time Error
    com.startComputer();                // Starting Computer
    com.stopComputer();                 // Stoping Computer
    com.stopLaptop();                   // Compile Time Error


CASE 2:
    Computer com = new Laptop();
    System.out.println(com.ram);          // 16
    System.out.println(com.storage);      // 256
    System.out.println(com.myStorage);    // Compile Time Error
    com.startComputer();                  // Starting Laptop
    com.stopComputer();                   // Stoping Computer
    com.stopLaptop();                     // Compile Time Error

CASE 3: (Invalid as we are creating object of parent with the reference of Child)
    Laptop com = new Computer();
    System.out.println(com.ram);          // 16
    System.out.println(com.storage);      // 256
    System.out.println(com.myStorage);    // Compile Time Error
    com.startComputer();                  // Starting Laptop
    com.stopComputer();                   // Stoping Computer
    com.stopLaptop();                     // Compile Time Error

CASE 4:
    Laptop com = new Laptop();
    System.out.println(com.ram);          // 32
    System.out.println(com.storage);      // 256
    System.out.println(com.myStorage);    // 512
    com.startComputer();                  // Starting Laptop
    com.stopComputer();                   // Stoping Computer
    com.stopLaptop();                     // Stoping Laptop

 */

public class Client {
    public static void main(String[] args) {
        Laptop com = new Laptop();
        System.out.println(com.ram);          // 32
        System.out.println(com.storage);      // 256
        System.out.println(com.myStorage);    // 512
        com.startComputer();                  // Starting Laptop
        com.stopComputer();                   // Stoping Computer
        com.stopLaptop();                     // Stoping Laptop
    }
}
