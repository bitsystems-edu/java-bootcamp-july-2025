package DAY21.org.bitsystems.Arrays2;

public class Client {
    public static void main(String[] args) {

        int[] array = {105, 10,1, 20,30,40,6, 50,60};
        ArrayExample ae = new ArrayExample();
        boolean isPresent = ae.isPresent(array, 30);

        if(isPresent) {
            System.out.println("Element is present");
        }
        else {
            System.out.println("NOt Present");
        }
       int minValue = ae.minimumElement(array);
        System.out.println("Minimum element in given array is " + minValue);
    }
}
