import java.util.Scanner;

public class ranitsa {

    public static void sortWeights(int[] weights){

        for(int i = 1; i < weights.length; i++){

            int t = weights[i];
            int lastSorted = i - 1;

            while (lastSorted >= 0 && weights[lastSorted] < t) {
                weights[lastSorted + 1] = weights[lastSorted];
                lastSorted--;
            }
            weights[lastSorted + 1] = t;
        }
    }
    public static void bagPackageCounterCheck(int capacity, int[] weights) {
        int index = 0;

        while(capacity > 0 && index < weights.length){
            capacity = capacity - weights[index];
            index++;
        }
        if(capacity < 0 || capacity == 0){
            System.out.println("BAG IS FULL");
        }
        else{
            System.out.println("BAG ISN’T FULL, IT STILL HAS " + capacity + " CAPACITY");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER CAPACITY --> ");
        int bagCapacity = scanner.nextInt();

        System.out.print("HOW MANY ITEMS ARE IN THE BAG? (2-5) --> ");
        int items = scanner.nextInt();

        int[] itemWeight = new int[items];

        while(items < 2 || items > 5 ){
            System.out.print("ENTER VALID NUMBER (2-5) --> ");
            items = scanner.nextInt();
        }
        for(int i = 0; i < items; i++){
            System.out.printf("HOW MUCH DO THE ITEMS WEIGH? [%d] :",i);
            itemWeight[i] = scanner.nextInt();
        }
        sortWeights(itemWeight);
        bagPackageCounterCheck(bagCapacity,
                itemWeight);
    }
}