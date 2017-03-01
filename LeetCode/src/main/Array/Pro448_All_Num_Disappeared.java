package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro448_All_Num_Disappeared {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		int index = 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == index){
				index++;
				continue;
			}else if (nums[i] > index) {
				while(index < nums[i]){
					list.add(index);
					index++;
				}
				i--;
			}
		}
		
		for (int i = index; i <= nums.length; i++) {
			list.add(i);
		}
		return list;

	}
}

//这个方法利用了array的序列，将array中nums[i]处的值取反证明这个位置在1~n中出现
//List<Integer> ret = new ArrayList<Integer>();
//
//for(int i = 0; i < nums.length; i++) {
//    int val = Math.abs(nums[i]) - 1;
//    if(nums[val] > 0) {
//        nums[val] = -nums[val];
//    }
//}
//
//所有没有取反的位置都证明位置对应的值没有在array中出现
//for(int i = 0; i < nums.length; i++) {
//    if(nums[i] > 0) {
//        ret.add(i+1);
//    }
//}
//return ret;