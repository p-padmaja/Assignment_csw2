package Assignment3;
public class q4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 6, 4};
        int n = arr.length;
        int k = 4;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }
        int ans = bad;
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] > k) {
                bad--;
            }
            if (arr[j] > k) {
                bad++;
            }
            ans = Math.min(ans, bad);
        }
        System.out.println("Minimum swaps required: " + ans);
    }
}

