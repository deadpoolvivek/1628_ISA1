import static org.junit.Assert.*;

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

		total=total+over1.Totalruns()+over2.Totalruns()+over3.Totalruns();
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		System.out.println("------ Score Sheet -----");
		over1.displayDetails();
		over2.displayDetails();
		over3.displayDetails();
		
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