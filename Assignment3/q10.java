package Assignment3;
import java.util.*;
public class q10 {
    private int[] array;
    
    public q10(int[] array) {
        this.array = array;
    }
    
    public int findMin() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public int findMax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    public double findMedian() {
        int length = array.length;
        if (length % 2 == 0) {
            int midIndex = length / 2;
            return (array[midIndex - 1] + array[midIndex]) / 2.0;
        } else {
            int midIndex = (length - 1) / 2;
            return array[midIndex];
        }
    }
    
    public void sortArray() {
        Arrays.sort(array);
    }
    
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 7};
        q10 integerList = new q10(array);
        integerList.sortArray();
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Minimum value: " + integerList.findMin());
        System.out.println("Maximum value: " + integerList.findMax());
        System.out.println("Median value: " + integerList.findMedian());
    }
}


