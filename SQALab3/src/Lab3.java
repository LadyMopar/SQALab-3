import java.util.ArrayList;
import java.util.List;

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
	public static List<Integer> primeFact(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i % 2 == 0){
			list.add(2);
			i/=2;
		}
		if(i>1){
			list.add(i);
		}
		return list;
	}

}
