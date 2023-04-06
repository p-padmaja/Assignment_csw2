package csw2_Assignment1;

public class q12 {
	public static int ArrayIndexMaxDiff(int[] arr, int size)	{
	  int maxDiff = -1;
	  int j;
	  for (int i = 0; i < size; i++){
	    j = size - 1;
	    while (j > i){
	      if (arr[j] > arr[i]){
	        maxDiff = Math.max(maxDiff, j - i);
	        break;
	      }
	      j -= 1;
	    }
	  }
	 return maxDiff;
	}
	
	public static void main(String[] args) {
		int[] arr = {33, 9, 10, 3, 2, 60, 30, 33, 1};
		System.out.println("MaxDiff : " + ArrayIndexMaxDiff(arr, arr.length));
	}
}


