import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array 1");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n1];
        for(int i= 0;i<n1;i++){
            System.out.println("Enter the " + (i+1) + " element for array 1");
            int element = scanner.nextInt();
            array[i] = element;
        }
        System.out.println(duplicates(array,n1));

    }

    public static int duplicates(int[] a, int n){
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i] == a[j]){
                    return a[i];
                }
            }
        }
        return -1;
}}

