package csw2_Assignment4;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum values in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Find values in the range between minimum and maximum that are absent in the array
        Set<Integer> set = new HashSet<>();
        for (int i = min; i <= max; i++) {
            set.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            }
        }

        // Print results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Values in range between minimum and maximum that are absent in the array: " + set);
    }
}
//o/p:
//Minimum value: 1
//Maximum value: 9
//Values in range between minimum and maximum that are absent in the array: [4, 7]
