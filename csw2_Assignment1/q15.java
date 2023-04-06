package csw2_Assignment1;

public class q15 {
	public static int GCD(int m, int n) {
		if (m < n) {
		   return (GCD(n, m));
		}
		if (m % n == 0) {
		   return (n);
		}
		return (GCD(n, m % n));
	}
	public static void main(String[] args) {
		System.out.println(GCD(10,25)); 
	}

}
