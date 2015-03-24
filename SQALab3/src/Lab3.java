import java.util.ArrayList;

/**
 * 
 */

/**
 * Writing method to be tested.
 *
 * @author richarel.
 *         Created Mar 24, 2015.
 */
public class Lab3 {
	

	/**
	 * Returns a list of prime factors of a given integer.
	 *
	 * @param i
	 * @return a string of factors
	 */
	public static ArrayList<Integer> primeFact(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(i!=1){
			list.add(i);
		}
		return list;
	}

}
