package csw2_Assignment1;

public class q14 {
	public static void towerOfHanoi(int num, char src, char dst, char temp) {
		if (num < 1) {
		    return;
		}
		towerOfHanoi(num - 1, src, temp, dst);
		System.out.println("Move " + num + " disk from peg " + src + " to peg " +dst);
		towerOfHanoi(num - 1, temp, dst, src);
	}
	public static void main(String[] args) {
		int num = 4;
		System.out.println("The sequence of moves are :\n");
		towerOfHanoi(num, 'A', 'C', 'B');
		}
}
