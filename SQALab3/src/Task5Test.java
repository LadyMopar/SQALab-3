import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * 
 */

/**
 * This is where I'm testing the method in Task 5 class.
 *
 * @author richarel.
 *         Created Mar 26, 2015.
 */
@RunWith(Parameterized.class)
public class Task5Test {
	private Task5 primeGen;
	private Integer input;
	private List<Integer> output;
	
	
	@Before
	public void initialize(){
		primeGen = new Task5();
	}
	
	public Task5Test(Integer input, List<Integer> output){
		this.input = input;
		this.output = output;
	}
	
	@Parameterized.Parameters
	public static Collection checkOutputs(){
		return Arrays.asList(new Object[][]{
				{2,null}, //first test
				{3, list(2)},
				{4, list(2,3)}
		});
	}
	
	private static List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}

	@Test
	public void testPrimeGenerator() {
		System.out.println("Parameterized Number is: " + input);
		assertEquals(output, Task5.generatePrime(input));
	}

}
