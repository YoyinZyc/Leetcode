package main.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Array-medium
 * @version Create at: 2017年3月2日 下午2:59:46
 * 
 */
public class Pro442_All_Duplicate {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int index = 0;
			if (nums[i] < 0) {
				index = (0-nums[i])-1;
			}else{
				index = nums[i] - 1;

			}
			if (nums[index] < 0) {
				list.add(1+index);
			}else{
				nums[index] = 0-nums[index];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i+1);
			}
		}
		return list;
	}
}
