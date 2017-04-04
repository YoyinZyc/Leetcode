package test;

import static org.junit.Assert.*;
import main.Pro451_Sort_Character_By_Frequency;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月3日 下午1:22:25
 * 
 */
public class Pro451_Sort_Character_By_FrequencyTest {
	Pro451_Sort_Character_By_Frequency test = new Pro451_Sort_Character_By_Frequency();
	@Test
	public void test() {
		test.frequencySort("tree");
	}

}
