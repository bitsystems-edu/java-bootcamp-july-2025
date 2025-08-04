package DAY21.org.bitsystems.Arrays2;

public class ArrayExample {

    //From a given array, find the element x

    public boolean isPresent(int[] array,  int element) {
        boolean isPreset = false;
        for(int i = 0; i<array.length; i++) {
            if(array[i] == element) {
                System.out.println(element + " is present at index "+ i);
                isPreset = true;
            }
        }
        return isPreset;
    }

    // Find min/max from an array
    public int minimumElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
