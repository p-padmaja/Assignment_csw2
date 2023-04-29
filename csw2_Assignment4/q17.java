package csw2_Assignment4;
import java.util.Arrays;

public class q17 {
    
    public static int countTriangles(int[] arr) {
        Arrays.sort(arr);  // Sort the array in non-decreasing order
        
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int k = i + 2;  // The third index
            for (int j = i + 1; j < arr.length - 1 && arr[i] != 0; j++) {
                // Find the maximum value of arr[i] + arr[j]
                // which is less than arr[k]
                while (k < arr.length && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                // All the values between j and k-1 can form a triangle with arr[i] and arr[j]
                count += k - j - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 6, 8, 9};
        int count = countTriangles(arr);
        System.out.println("Number of triangles: " + count);
    }
}
//o/p:Number of triangles: 28