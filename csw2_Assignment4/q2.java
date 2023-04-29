package csw2_Assignment4;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        Set<Integer> set = new HashSet<Integer>();
        System.out.println("Duplicates elements are:");
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.print(arr[i] + " ");
            }
           
        }
    }
}
//o/p:
//Duplicates elements are:
//3 5 7 9 
