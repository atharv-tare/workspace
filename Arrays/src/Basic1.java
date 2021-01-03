import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0 ;i<10;i++){
            array[i] = scan.nextInt();
            scan.nextLine();
        }

        for(int value:array){
            System.out.print(value + " ");
        }
    }
}
