package DAY19.org.bitsystems.oops4;

/**
 * Interface:
 *      - This is a contract of methods b/w classes
 *      - Loose Coupling [Code to interface, not to implementation]
 *          e.g
 *              PhonePay -> SBI, [YesBank]
 *              A a = new B();
 *              A a = new C()
 *      - A class using interface will implement it (not extends)
 *      - it has only method declaration, not definition.
 *      - Method definition will be provided by classes impmementing interface
 *      - All methods inside interfaces are by default public.
 *      - all methods are abstract by default in interface
 */

public interface Callable {
    void displayName();
}
