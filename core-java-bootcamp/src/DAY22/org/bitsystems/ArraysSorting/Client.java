package DAY22.org.bitsystems.ArraysSorting;

public class Client {
    public static void main(String[] args) {

        int[] array = {4, 1, 7, 6, 6, -1, 3, 5,};

        Sorting sorting = new Sorting();
        int[] sortedArray = sorting.bubbleSort(array);
       // int[] sortedArray = sorting.selectionSort(array);
        //System.out.println("Sorted Array: "+sortedArray);

        System.out.println("=============================");
        // Print the final sorted array:
        for(int i = 0; i<sortedArray.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("=============================");
    }
}
