import java.util.Scanner;

public class Intermediate6 {
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
        sort(array,0,n-1);
        printArray(array);


    }

     public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] =  temp;

        return i+1;
    }

    public static void sort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }

    public static void printArray(int arr[]){
        for(int value:arr){
            System.out.print(value + " ");
        }
    }
}
