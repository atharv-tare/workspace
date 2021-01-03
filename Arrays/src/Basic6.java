import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        for(int i=0;i<9;i++){
            System.out.println("Enter the " + (i+1) + " element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array[i] = element;
        }
        System.out.println("Enter the Kth number for reference");
        int K = scan.nextInt();
        scan.close();

        int temp;
        for(int i =0;i<array.length-1;i++){
            for(int j = 0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }

        System.out.println("Largest : "+ array[9-K-1]);
        System.out.println("Smallest : "+ array[K-1]);
    }
}
