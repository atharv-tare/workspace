import java.util.Scanner;

public class Intermediate2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        scan.nextLine();
        int[] array = new int[size];
        for(int i= 0;i<size;i++){
            System.out.println("Enter the " + i+1 + " element");
            int element = scan.nextInt();
            array[i] = element;
        }

        int last = array[size-1];
        for(int i = size-1; i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = last;
        for (int value:array){
            System.out.print(value + " ");
        }
    }
}
