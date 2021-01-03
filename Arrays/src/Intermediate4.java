import java.util.Scanner;

public class Intermediate4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the sum");
        int sum = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for(int i= 0;i<n;i++){
            System.out.println("Enter the " + (i+1) + " element");
            int element = scanner.nextInt();
            array[i] = element;
        }
        int count = 0;
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(array[i] + array[j] == sum){
                    count++;
                }
            }
        }

        System.out.println(count);










    }
}
