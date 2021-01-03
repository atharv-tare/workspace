import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[11];
        for(int i=0;i<11;i++){
            System.out.println("Enter the " + (i+1) + " element to be stored in an array");
            int element = scan.nextInt();
            scan.nextLine();
            array[i] = element;
        }
        System.out.println("Enter the Kth number for reference");
        int K = scan.nextInt();
        scan.close();

        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(K == array[i]){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
