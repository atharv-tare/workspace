import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0;i<size;i++){
            System.out.println("Enter the" + (i + 1) + " element");
            int element = scan.nextInt();
            scan.nextLine();
            array.add(i,element);
        }

        int temp = Integer.MIN_VALUE;
        int temp1 = Integer.MAX_VALUE;
        //for  max element
        for (int i = 0; i<size;i++){
            temp = Math.max(temp,array.get(i));
        }
        for (int i = 0; i<size;i++){
            temp1 = Math.min(temp1,array.get(i));
        }



        System.out.println( "Max : " + temp);
        System.out.println( "Min : " + temp1);
    }
}
