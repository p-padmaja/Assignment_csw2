package Assignment3;
import java.util.*;
public class q8 {
	public static void main(String[] args) {
	   int[] arr1= {1,3,5,7};
	   int[] arr2= {2,4,6,9};
	   sortTwoArrays(arr1, arr2);

       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));
   }

   public static void sortTwoArrays(int[] arr1, int[] arr2) {
       int n = arr1.length;
       int m = arr2.length;

       for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {
           if (arr1[i] > arr2[j]) {
               int temp = arr1[i];
               arr1[i] = arr2[j];
               arr2[j] = temp;
           }
       }

       Arrays.sort(arr1);
       Arrays.sort(arr2);
   }

}


