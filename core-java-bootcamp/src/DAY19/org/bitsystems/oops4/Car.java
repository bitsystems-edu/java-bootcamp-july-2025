package DAY19.org.bitsystems.oops4;

public class Car implements Callable, ModelNames {
    @Override
    public void displayName() {
        System.out.println("I am Car - Maruti 800");
    }

    @Override
    public void getModelName() {
        System.out.println("Maruti - 800 [2001]");
    }
}
