import static org.junit.Assert.*;

import java.util.ArrayList;

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

	@Test
	public void testReturnEmptyFor1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(list, Lab3.primeFact(1));
	}

	@Test
	public void testReturn2For2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(list, Lab3.primeFact(2));
	}
	
	@Test
	public void testReturn3For3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		assertEquals(list, Lab3.primeFact(3));
	}

}
