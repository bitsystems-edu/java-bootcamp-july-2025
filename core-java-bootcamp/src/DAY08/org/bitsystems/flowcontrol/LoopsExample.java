package DAY08.org.bitsystems.flowcontrol;

public class LoopsExample {
    public static void main(String[] args) {
        System.out.println("================ FOR LOOP- INCREMENT =============");
        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }

        System.out.println("================ FOR LOOP- DECREMENT =============");
        for(int i = 5; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("================ WHILE LOOP- INCREMENT =============");

        int j = 0;
        while (j <= 10){
            System.out.println(j);
            j++;
        }

        System.out.println("================ WHILE LOOP- DECREMENT =============");
        int k = 10;
        while(k>=0) {
            System.out.println(k);
            k--;
        }
    }
}
