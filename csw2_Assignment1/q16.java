package csw2_Assignment1;
import java.util.*;
public class q16 {
	public static void permutation(int[] arr, int i, int length) {
		if (length == i) {
		printArray(arr, length);
		return;
		}
		int j = i;
		for (j = i; j < length; j++) {
		swap(arr, i, j);
		permutation(arr, i + 1, length);
		swap(arr, i, j);
		}
		return;
		}
	  public static void printArray(int arr[],int length) {
		  for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+",");
		  }
		  System.out.println();
	  }
	  public static void swap(int arr[],int i,int j) {
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
	  }
		public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
		arr[i] = i;
		}
		permutation(arr, 0, 5);
		}

}
