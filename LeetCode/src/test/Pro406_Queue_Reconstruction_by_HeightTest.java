package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro406_Queue_Reconstruction_by_Height;

/**
 * @author Cactus
 * @category
 * @version Create at: Sep 8, 2017 2:32:14 PM
 */
public class Pro406_Queue_Reconstruction_by_HeightTest {
	Pro406_Queue_Reconstruction_by_Height test = new Pro406_Queue_Reconstruction_by_Height();
	@Test
	public void test() {
		int people[][] = {
			{7,0}, {4,4}, {7,1},
			{5,0}, {6,1}, {5,2}
		};
		test.reconstructQueue(people);
	}

}
