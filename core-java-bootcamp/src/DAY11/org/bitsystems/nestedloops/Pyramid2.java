package DAY11.org.bitsystems.nestedloops;

public class Pyramid2 {
    public static void main(String[] args) {
        int totalRows = 10;

        //i -> row
        //N -> totalRows
        //space
        //j -> columns
        //very first loop in below defines total number of rows
        for(int row = 1; row <= totalRows; row++) {

            //This loop below defines total number of spaces
            for(int space = 1; space <= totalRows - row; space++) {
                System.out.print(" ");
            }
            //This loop below defines total number of columns
            for(int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
