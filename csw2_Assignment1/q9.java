package csw2_Assignment1;
import java.util.*;
public class q9 {
	  public static int firstMissingPositive(int[] arr, int n){
          Arrays.sort(arr);
          int ans = 1;
          for (int i = 0; i < n; i++) {
             if (arr[i] == ans)
               ans++;
           }
             return ans;
      }
	public static void main(String[] args) {
		 int arr[] = { 0, 10, 2, -10, -20 };
	        int n = arr.length;
	        int ans = firstMissingPositive(arr, n);
	        System.out.println(ans);	    
	}

}
