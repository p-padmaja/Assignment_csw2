package csw2_Assignment1;

public class q8 {
	public static void indexArray(int[] arr, int size){
		for( int i = 0; i< size; i++){
		   int curr = i;
		   int value = -1;
		/* swaps to move elements in proper position. */
		   while (arr[curr] != -1 && arr[curr] != curr){
		      int temp = arr[curr];
		       arr[curr] = value;
		       value = curr = temp;
		   }
		/* check if some swaps happened.*/
		   if (value != -1){
		       arr[curr] = value;
		   }
		 }
    }
	public static void main(String[] args) {
		int[] arr= {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
		indexArray(arr, 10);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
