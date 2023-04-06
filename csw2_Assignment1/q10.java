package csw2_Assignment1;
import java.util.*;
public class q10 {
	public static void MaxMinArr(int arr[], int size) {
		int[] aux = new int[size];
		for (int i = 0; i < size; i++) {
		     aux[i] = arr[i];
		}
		int start = 0;
		int stop = size - 1;
		for (int i = 0; i < size; i++) {
		    if (i % 2 == 0) {
		      arr[i] = aux[stop];
		      stop -= 1;
		    } 
		    else {
		      arr[i] = aux[start];
		      start += 1;
		    }
		 }
	}
	
	public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int size = arr.length;
			MaxMinArr(arr, size);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
			}
	}
}


