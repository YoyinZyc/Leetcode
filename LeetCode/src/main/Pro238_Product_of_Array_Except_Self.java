package main;

/**
 * @author Cactus
 * @category TopLiked-Medium & Array
 * @version Create at: Sep 7, 2017 8:04:20 PM
 */
public class Pro238_Product_of_Array_Except_Self {
	public int[] productExceptSelf(int[] nums) {
		int[] ret = new int[nums.length];
		ret[0] = 1;
		for (int i = 1; i < ret.length; i++) {
			ret[i] = ret[i-1] * nums[i-1];
		}
		
		int right = 1;
		for (int i = nums.length-1; i >= 0; i--) {
			ret[i] = ret[i] * right;
			right = right * nums[i];
		}
		return ret;
	}
}
