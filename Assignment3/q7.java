package Assignment3;
import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 3, 6};
        int n = array.length;
        while (true) {
            Arrays.sort(array); // sort the array in ascending order
            int smallestPositive = Integer.MAX_VALUE;
            boolean positiveFound = false;

            // find the smallest positive element
            for (int i = 0; i < n; i++) {
                if (array[i] > 0 && array[i] < smallestPositive) {
                    smallestPositive = array[i];
                    positiveFound = true;
                }
            }
            // if no positive element is found, break out of the loop
            if (!positiveFound) {
                break;
            }
            // subtract the smallest positive element from all elements
            for (int i = 0; i < n; i++) {
                array[i] -= smallestPositive;
            }
            // count the number of positive elements left
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > 0) {
                    count++;
                }
            }
            // print the number of elements left
            System.out.println(count);
        }
    }
}

