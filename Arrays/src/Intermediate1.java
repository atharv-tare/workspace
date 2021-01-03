import java.util.*;

public class Intermediate1 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8};
        int [] array2 = {5,6,7,8,9,10123,324,123};
        HashSet<Integer> Union = new HashSet<>();
        Unionfunction(array1,array2,Union);
        System.out.println( Unionfunction(array1,array2,Union));
    }


    public static Set<Integer> Unionfunction(int[ ] arr1, int[] arr2, HashSet<Integer> finalList){
        int i=0;
        int j = 0;

        while(i<arr1.length){
            finalList.add(arr1[i++]);
        }
        while(j<arr2.length){
            finalList.add(arr2[j++]);
        }

        return finalList;
    }
}