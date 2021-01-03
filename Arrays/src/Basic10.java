import java.util.Scanner;

public class Basic10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        scan.nextLine();
        int[] array = new int[size];
        for(int i= 0;i<size;i++){
            System.out.println("Enter the " + i + " element");
            int element = scan.nextInt();
            array[i]= element;
        }
        int i = 0, temp;
        int pivot = 0;
        for(int a =0;a< array.length;a++){
            if(array[a] < pivot){
                if(i!=a) {
                     temp = array[i];
                    array[i] = array[a];
                    array[a] = temp;
                }
               i++;

            }

        }

        for(int value:array){
            System.out.print(value + " ");
        }
    }
}
