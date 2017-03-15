package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月13日 下午9:55:53
 * 
 */
public class Pro33_Search_In_Rotated_Array {
	public int search(int[] nums, int target) {
		  if(nums.length == 0){
	            return -1;
	        }
	        
	        if((nums[0] != target)&&(nums.length == 1)) return -1;
	        
	        if (nums[0] == target) {
				return 0;
			}
			
			if (nums[0] < target) {
				int i = 1;
				while((nums[i] < target) && (i < nums.length-1)) i++;
				if (nums[i] == target) {
					return i;
				}else {
					return -1;
				}
			}
			
			int i = nums.length-1;
			
			while((nums[i] > target) && (i > 0)) i--;
			if (nums[i] == target) {
				return i;
			}else {
				return -1;
			}
			
	}
	
}
