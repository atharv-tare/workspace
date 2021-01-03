import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for(int i= 0;i<n;i++){
            System.out.println("Enter the " + (i+1) + " element");
            int element = scanner.nextInt();
            array[i] = element;
        }
            System.out.println(duplicates(array,n));


    }

    public static ArrayList<Integer> duplicates(int[] a, int n){
       ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i] == a[j]){
                    arr.add(a[i]);
                }
            }
        }
        return arr;
    }
}
