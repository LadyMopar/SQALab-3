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
		return Arrays.asList(integers);
	}

	@Test
	public void testReturnEmptyFor1() throws Exception {
		assertEquals(list(), Lab3.primeFact(1));
	}

	@Test
	public void testReturn2For2() throws Exception {
		assertEquals(list(2), Lab3.primeFact(2));
	}
	
	@Test
	public void testReturn3For3() throws Exception {
		assertEquals(list(3), Lab3.primeFact(3));
	}
	
	@Test
	public void test4() throws Exception{
		assertEquals(list(2,2), Lab3.primeFact(4));
	}
	
	@Test
	public void test6() throws Exception{
		assertEquals(list(2,3), Lab3.primeFact(6));
	}
	
	@Test
	public void test8() throws Exception{
		assertEquals(list(2,2,2), Lab3.primeFact(8));
	}
	
	@Test
	public void test9() throws Exception{
		assertEquals(list(3,3), Lab3.primeFact(9));
	}
	
	@Test
	public void test325115() throws Exception{
		assertEquals(list(5, 7, 7, 1327), Lab3.primeFact(325115));
	}

}
