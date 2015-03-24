import static org.junit.Assert.*;

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
		assertEquals("", Lab3.primeFact(1));
	}

	@Test
	public void testReturn2For2() {
		assertEquals("2", Lab3.primeFact(2));
	}
	
	@Test
	public void testReturn3For3() {
		assertEquals("3", Lab3.primeFact(3));
	}

}
