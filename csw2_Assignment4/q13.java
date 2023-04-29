package csw2_Assignment4;
import java.util.Arrays;

public class q13 {
    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 8, 15};
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int firstNum = 0, secondNum = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                firstNum = arr[i];
                secondNum = arr[i + 1];
            }
        }
        System.out.println("Pair with minimum difference: " + firstNum + ", " + secondNum);
    }
}
//o/p:Pair with minimum difference: 3, 5
