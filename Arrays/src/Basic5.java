import java.util.ArrayList;
import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];
        scan.nextLine();
        for(int i=0;i<6;i++){
            System.out.println("Enter the " + (i+1) + " element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array[i] = element;
        }

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

        for(int value:array){
            System.out.print(value+ " ");
        }
    }
}
