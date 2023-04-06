package csw2_Assignment1;

public class q6 {
	public static int maxSubArraySum(int[] a, int size) {
		int presum = 0, sum = 0;
		for (int i = 0; i < size; i++) {
		     sum=sum+ a[i];
		     if (sum< 0) {
		        sum = 0;
		     }
		     if(presum <sum) {
		        presum =sum;
		     }
		}
		 return presum;
		}
	public static void main(String[] args) {
		int[] arr = {1,-2,3,4,-4,6,-4,3,2};
		System.out.println("Max sub array sum :" + maxSubArraySum(arr, 9));
	}

}
