import java.util.Arrays;
import java.util.Scanner;

public class Intermediate10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            int element = scanner.nextInt();
            array[i] = element;
        }

        int i = 0;
        int j = n-1;
        while(i<j){
            if(array[i] <0 && array[j] >0){
                j--;
                i++;
            }
            else if(array[i]>0 && array[j]<0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            else if(array[i] < 0){
                i++;
            }
            else if(array[j] >0){
                j--;
            }

        }
        int k = 0;
        if(i == 0 || i == n){
            System.out.println(Arrays.toString(array));
        }
        else{
            int temp = array[i];
            while(i<n && k<n) {
                array[i] = array[k];
                array[k] = temp;
                k += 2;
                i++;
            }

            for (int value: array
                 ) {
                System.out.println(value);
            }
        }
    }

}
