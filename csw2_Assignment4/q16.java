package csw2_Assignment4;
import java.util.Arrays;

public class q16 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8, 9, 3};
        int target = 14;
        findTriplet(arr, target);
    }

    public static void findTriplet(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No triplet found.");
    }
}
//o/p:Triplet found: 1, 4, 9
