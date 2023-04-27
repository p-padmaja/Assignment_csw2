package Assignment3;
import java.util.*;
public class q1 {
    public static void sortArray(int[] arr) {
        int left = 0; // Pointer at the beginning of the array
        int right = arr.length - 1; // Pointer at the end of the array
        int swaps = 0; // Variable to keep track of swaps
        while (left < right) {
            // Move the left pointer to the right until a 1 is encountered
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move the right pointer to the left until a 0 is encountered
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap the 0 at the left pointer with the 1 at the right pointer
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                swaps++; // Increment swaps counter
            }
        }
        System.out.println("Number of swaps required is :"+swaps);
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));      
		
    }
}

