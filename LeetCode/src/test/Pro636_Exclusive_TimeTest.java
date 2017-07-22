package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.Pro636_Exclusive_Time;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月21日 下午1:58:21
 * 
 */
public class Pro636_Exclusive_TimeTest {
	Pro636_Exclusive_Time test = new Pro636_Exclusive_Time();
	@Test
	public void test() {
		String  strs[] = {"0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"};
		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < strs.length; i++) {
			logs.add(strs[i]);
		}
		test.exclusiveTime(2, logs);
		
	}

}
