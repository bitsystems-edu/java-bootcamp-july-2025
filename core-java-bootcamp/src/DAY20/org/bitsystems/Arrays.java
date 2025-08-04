package DAY20.org.bitsystems;

public class Arrays {
    //How to print an array
    public void printArray(int[] userArray) {
        int length = userArray.length;
        for(int i = 0; i<length; i++) {
            System.out.print(userArray[i]+ " ");
        }
    }

    // How to find the length of an array
    public int arrayLength(int[] userArray) {
        // int length = userArray.length;
        return userArray.length;
       // return length;
    }

}
