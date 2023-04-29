package csw2_Assignment4;
import java.util.Arrays;
public class q10 {
    public static void main(String[] args) {
        int[] arr = {5, -2, 3, -4, 1, -5, 2, 8, -6};
        Arrays.sort(arr); // sort the array in ascending order
        
        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0; // initialize variables to hold the two numbers whose sum is closest to zero
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                num1 = arr[left];
                num2 = arr[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
        System.out.println("The two elements whose sum is closest to zero are " + num1 + " and " + num2 + ".");
    }
}
//o/p:The two elements whose sum is closest to zero are -5 and 5.