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
	 * Generates a list of prime numbers that are strictly smaller that the
	 * input.
	 * 
	 * @param input
	 * @return
	 */
	public static Object generatePrime(Integer input) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(input -= 1; input > 1; input --){
			list.add(input);
		}
		return list;
	}

}
