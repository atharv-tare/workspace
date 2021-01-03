import java.util.Scanner;

public class Intermediate3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        scan.nextLine();
        int[] array = new int[range-1];
        for(int i=0;i<range-1;i++){
            System.out.println("Enter the " + i + " element");
            int element = scan.nextInt();
            scan.nextLine();
            array[i] = element;
        }
        System.out.println(MissingNumber(array,range));


    }

    public static int MissingNumber(int[] arr, int n){
        for(int i= 1; i<=n;i++){
            if(arr[i-1] != i){
                return i;
            }
        }
        return -1;
    }
}
