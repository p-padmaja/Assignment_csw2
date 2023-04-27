package Assignment3;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        int[] arr1 = { 4, 7, 1, 3, 9 ,3};
        int[] arr2 = { 9, 7, 4, 3, 1 };
        sortArray(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void sortArray(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    temp[index++] = arr1[j];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = temp[i];
        }
    }
}

