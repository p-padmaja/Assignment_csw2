package csw2_Assignment4;
public class q20{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2};
        int key = 7;
        int index = bitonicSearch(arr, key);
        System.out.println(index == -1 ? "Element not found" : "Element found at index " + index);
    }

    public static int bitonicSearch(int[] arr, int key) {
        int peak = findPeak(arr);
        return Math.max(binarySearch(arr, key, 0, peak), binarySearch(arr, key, peak + 1, arr.length - 1));
    }

    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

//o/p:Element found at index 3