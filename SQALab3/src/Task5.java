import java.util.ArrayList;

/**
 * 
 */

/**
 * This is where I wrote the method to be tested.
 * 
 * @author richarel. Created Mar 26, 2015.
 */
public class Task5 {

	/**
	 * Generates a list of prime numbers that are strictly smaller than the
	 * input.
	 * 
	 * @param input
	 * @return
	 */
	public static Object generatePrime(Integer input) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < input; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}

	/**
	 * Checks to see if a number is prime.
	 * 
	 * @param i
	 * @return
	 */
	private static boolean isPrime(int i) {
		if (i % 2 == 0 && i != 2) {
			return false;
		}
		for (int k = 3; k * k < i; k += 2) {
			if (i > k && i % k == 0) {
				return false;
			}
		}
		return true;
	}
}
