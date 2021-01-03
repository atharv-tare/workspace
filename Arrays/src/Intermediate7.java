import java.util.*;

public class Intermediate7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array 1");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        int[] array1 = new int[n1];
        for(int i= 0;i<n1;i++){
            System.out.println("Enter the " + (i+1) + " element for array 1");
            int element = scanner.nextInt();
            array1[i] = element;
        }
        System.out.println("Enter the no. of elements in array 2");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        int[] array2 = new int[n2];
        for(int i= 0;i<n2;i++){
            System.out.println("Enter the " + (i+1) + " element for array 1");
            int element = scanner.nextInt();
            array2[i] = element;
        }
        System.out.println(duplicates(array1,array2));

    }

    public static ArrayList<Integer> duplicates(int[] a1, int [] a2){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a1){
            map.put(i,map.getOrDefault(i,0) +1);
        }
        for(int i:a2){
            if(map.containsKey(i) && map.get(i) > 0){
                arr.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
