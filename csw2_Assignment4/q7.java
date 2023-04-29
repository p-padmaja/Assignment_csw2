package csw2_Assignment4;
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6};
        int oddElement = 0;
        for (int i = 0; i < arr.length; i++) {
            oddElement ^= arr[i]; // XOR operation to find odd element
        }
        System.out.println("The element that appears odd number of times is: " + oddElement);
    }
}
//o/p-The element that appears odd number of times is: 5