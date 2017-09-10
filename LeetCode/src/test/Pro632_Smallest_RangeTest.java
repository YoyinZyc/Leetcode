package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.Pro632_Smallest_Range;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年9月10日 下午3:11:57
 * 
 */
public class Pro632_Smallest_RangeTest {
	Pro632_Smallest_Range test = new Pro632_Smallest_Range();
	@Test
	public void test() {
		List<List<Integer>> nums = new ArrayList<List<Integer>>();
		int[] n1 = {4,10,15,24,26};
		int[] n2 = {0,9,12,20};
		int[] n3 = {5,18,22,30};
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < n2.length; i++) {
			list2.add(n2[i]);
			
		}
		for (int i = 0; i < n1.length; i++) {
			list1.add(n1[i]);
			
		}
		for (int i = 0; i < n3.length; i++) {
			list3.add(n3[i]);
			
		}
		
		nums.add(list1);
		nums.add(list2);
		nums.add(list3);
		test.smallestRange(nums);
	}

}
