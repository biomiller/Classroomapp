package come.bae.TraineeMapTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.repository.TraineeMapRepository;
import com.bae.util.Constants;
import com.bae.util.JSONUtil;

public class TraineeMapTest {
	
	JSONUtil jsonutil;
	TraineeMapRepository testTMR;

	@Before
	public void setup() {

		jsonutil = new JSONUtil();
		testTMR = new TraineeMapRepository();
	}
	
	@Test
	public void addTraineeTest() {
		testTMR.createTrainee(Constants.TRAINEE1);

		assertTrue(1 == testTMR.getTraineeMap().size());
	}
	
	@Test
	public void add2TraineeTest() {
		testTMR.createTrainee(Constants.TRAINEE1);
		testTMR.createTrainee(Constants.TRAINEE2);

		assertTrue(2 == testTMR.getTraineeMap().size());
	}
	
	@Test
	public void deleteTraineeTest() {
		testTMR.createTrainee(Constants.TRAINEE1);
		testTMR.createTrainee(Constants.TRAINEE2);
		
		testTMR.deleteTrainee(1);

		assertTrue(1 == testTMR.getTraineeMap().size());
	}
	
	@Test
	public void getTraineeTest() {
		
		testTMR.createTrainee(Constants.TRAINEE1);
		
		assertEquals(Constants.TRAINEE1, testTMR.getTrainee(1));
		
	}

}
