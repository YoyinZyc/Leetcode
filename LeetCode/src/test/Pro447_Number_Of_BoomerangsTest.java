package test;

import static org.junit.Assert.*;
import main.Pro447_Number_Of_Boomerangs;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月21日 下午4:32:44
 * 
 */
public class Pro447_Number_Of_BoomerangsTest {
	Pro447_Number_Of_Boomerangs test = new Pro447_Number_Of_Boomerangs();
	@Test
	public void test() {
		int points[][] = {{1,0},{2,0},{0,0}};
		test.numberOfBoomerangs(points);
		
	}

}
