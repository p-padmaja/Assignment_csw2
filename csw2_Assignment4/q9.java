package csw2_Assignment4;
import java.util.*;
import java.util.*;
public class q9{

    public static void main(String[] args) {
        
        // Sample input array
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 5, 6};
        
        // Create a HashSet to store distinct elements
        Set<Integer> distinctElements = new HashSet<Integer>();
        
        // Loop through the array and add each element to the HashSet
        for (int i = 0; i < arr.length; i++) {
            // If an element is repeated continuously, only add it once
            if (i == arr.length - 1 || arr[i] != arr[i+1]) {
                distinctElements.add(arr[i]);
            }
        }
        
        // Calculate the sum of the distinct elements
        int sum = 0;
        for (int element : distinctElements) {
            sum += element;
        }
        
        // Print the sum
        System.out.println("Sum of distinct elements: " + sum);
    }
}
//o/p:Sum of distinct elements: 21