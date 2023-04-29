package csw2_Assignment4;
import java.util.*;
public class q19 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 7, 1, 9, 3, 6}; // example unsorted array
        int n = nums.length;

        int middleIndex = n / 2;

        // sort the array
        Arrays.sort(nums);

        // print the middle element
        System.out.println("The middle element is: " + nums[middleIndex]);
    }
}
//o/p:The middle element is: 5