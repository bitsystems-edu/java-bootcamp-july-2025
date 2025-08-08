package DAY22.org.bitsystems.ArraysSorting;

public class Sorting {

    public int[] bubbleSort(int[] A) {
        int length = A.length;
        for (int i = 0; i < length; i++) {
            // for(int j = 0; j<length-1; j++) {
            for (int j = 0; j <= length - i - 2; j++) {
                  if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }

    public int[] selectionSort(int[] A) {
        int N = A.length;
        for(int i = 0; i < N; i++) {
            int min = A[i];
            int min_index = i;
            for(int j = i+1; j<N; j++) {
                if(A[j] < min) {
                    min = A[j];
                    min_index = j;
                }
            }
            if(A[i] > A[min_index]) { // swap
                int temp = A[i];
                A[i] = A[min_index];
                A[min_index] = temp;
            }
        }
        return A;
    }


    public int[] mergerSort(int[] A) {
        return A;
    }
}
