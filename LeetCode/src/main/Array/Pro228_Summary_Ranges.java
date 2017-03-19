package main.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月15日 下午11:10:53
 * 
 */
public class Pro228_Summary_Ranges {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if (nums.length == 0) {
			return list;
		}
		if (nums.length == 1) {
			list.add(nums[0]+"");
			return list;
		}
		
		
		int startNum = nums[0];
		int endNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == (nums[i-1]+1)) {
				endNum = nums[i];
			}else {
				if (startNum == endNum) {
					list.add(startNum + "");
				}else {
					list.add(startNum+"->"+endNum);
				}
				startNum = nums[i];
				endNum = nums[i];
			}
		}
		return list;
		
		
 	}
}
