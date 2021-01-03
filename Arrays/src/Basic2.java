import java.util.ArrayList;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter the " + (i+1) + "th element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array.add(i,element);
        }

        System.out.println("Enter the element to be searched for");
        int e = scan.nextInt();
        scan.close();

        for(int i=0;i<size;i++){
            if(array.contains(e)){
                System.out.println("The element " + e + " was found in the array");
                break;
            }
            else
                System.out.println("The element entered could not be found");
        }
    }
}
