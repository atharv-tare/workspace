import java.util.Scanner;

public class Basic8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        scan.nextLine();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the " + (i+1) + " element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array[i] = element;
        }

        int lo = 0;
        int mid= 0;
        int hi = size -1;

        while(mid <= hi){
            switch (array[mid]){
                case 0:
                    int temp = array[lo];
                    array[lo] = array[mid];
                    array[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1 = array[mid];
                    array[mid] = array[hi];
                    array[hi] = temp1;
                    hi--;
                    break;
            }
        }

        for(int value: array){
            System.out.println(value);
        }

    }
}
