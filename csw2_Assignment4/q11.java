package csw2_Assignment4;
public class q11{

    public static void findElements(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    System.out.println("Elements found: " + arr[i] + " and " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("No elements found that add up to " + value);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int value = 12;
        findElements(arr, value);
    }
}
//o/p:Elements found: 2 and 10