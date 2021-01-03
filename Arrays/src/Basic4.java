import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter the " + (i+1) + " element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array.add(i,element);
        }
        Collections.reverse(array);
        for(int value:array){
            System.out.print(value + " ");
        }
    }
}
