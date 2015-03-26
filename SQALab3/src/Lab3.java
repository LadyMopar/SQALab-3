import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * Writing method to be tested.
 * 
 * @author richarel. Created Mar 24, 2015.
 */
public class Lab3 {

	/**
	 * Returns a list of prime factors of a given integer.
	 * 
	 * @param i
	 * @return a string of factors
	 */
	public static List<Integer> primeFact(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int factor = 2;
		while (i > 1) {
			for (; i % factor == 0; i /= factor) {
				list.add(factor);
			}
			factor++;
		}
		return list;
	}

}
