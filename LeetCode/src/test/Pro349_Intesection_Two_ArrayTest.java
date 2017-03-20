package test;

import static org.junit.Assert.*;
import main.Pro349_Intesection_Two_Array;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月20日 下午8:58:44
 * 
 */
public class Pro349_Intesection_Two_ArrayTest {
	Pro349_Intesection_Two_Array test = new Pro349_Intesection_Two_Array();
	@Test
	public void test() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,8,4,9,4};
		test.intersection(nums1, nums2);
	}

}
