import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class scoreTest {

	score over1,over2,over3;
	String total;

	@Before
	public void setUp() throws Exception {
		over1 = new score("1","1 2 3 4 5 6","0 1 2 3 4 5 6");
		over2 = new score("2","1 2 3 4 5 6","0 1 2 3 4 5 6");
		over3 = new score("3","1 2 3 4 5 6","0 1 2 3 4 5 6");

		int sum = Arrays.stream(over1.getRuns().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sum();
		int sum1 = Arrays.stream(over2.getRuns().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sum();
		int sum2 = Arrays.stream(over3.getRuns().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sum();
		total=total+sum;
		
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		System.out.println("------ Score Sheet -----");
		over1.displayDetails();
		over2.displayDetails();
		over3.displayDetails();
		System.out.println("-----Total runs-----:- "+total);
	}


	@Test
	public void testGetPrice() {
		
		
		System.out.println("-----Total runs-----:- "+total);
		
		
	}


	@Test
	public void testGetQuantity() {
	}
	
	@Test
	public void testGetFinalRate() {
		

	}

}