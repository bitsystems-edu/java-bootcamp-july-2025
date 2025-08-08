package DAY20.org.bitsystems;

public class ClientArray {
    public static void main(String[] args) {

    // How to declare an array

    //First way:
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // array[5] = 60;

    // Second way:
        int[] arrayTwo = new int[5];
        arrayTwo[0] = 10;
        arrayTwo[1] = 20;
        arrayTwo[2] = 30;
        arrayTwo[3] = 40;
        arrayTwo[4] = 50;

        //What is array index out of bound.

    // Third way:
        int[] array = {105, 10,20,30,40,6, 50,60};

    //   ArrayIndexOutOfBoundsException

    //    Accessing any element with is at length or >length index

        System.out.println("Index Value: "+array[0]);

       // int length = array.length;
       // System.out.println("Length of given array " +length);
            //        for(int i = 0; i<length; i++) {
            //            System.out.print(array[i]+ " ");
            //        }

        System.out.println("====================");
        // Calling and printing array via object
        Arrays arraysObj = new Arrays();
        arraysObj.printArray(array);
        System.out.println("\n====================");
       int length = arraysObj.arrayLength(array);
        System.out.println("Array Length : " + length);

    }
}
