package csw2_Assignment4;
public class q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int missing = sum;
        for (int i = 0; i < arr.length; i++) {
            missing -= arr[i];
        }
        System.out.println("Missing element is: " + missing);
    }
}
//o/p:Missing element is: 5