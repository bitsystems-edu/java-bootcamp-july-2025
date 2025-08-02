package DAY19.org.bitsystems.oops4;

public class Client {
    public static void main(String[] args) {
        Callable bike = new Bike();
        bike.displayName();

        Callable car = new Car();
        car.displayName();
    }
}
