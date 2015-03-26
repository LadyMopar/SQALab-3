import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 */

/**
 * Test lab 3 exersizes.
 *
 * @author richarel.
 *         Created Mar 24, 2015.
 */
public class Lab3Test {
	
	private List<Integer> list(Integer...integers){
		return Arrays.asList();
	}

	@Test
	public void testReturnEmptyFor1() {
		assertEquals(list(), Lab3.primeFact(1));
	}

	@Test
	public void testReturn2For2() {
		assertEquals(list(2), Lab3.primeFact(2));
	}
	
	@Test
	public void testReturn3For3() {
		assertEquals(list(3), Lab3.primeFact(3));
	}

}
