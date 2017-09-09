package main;

/**
 * @author Cactus
 * @category TopLiked-Medium && Map
 * @version Create at: Sep 9, 2017 4:57:31 PM
 */
public class Pro560_Subarray_Sum_Equals_K {
	public int subarraySum(int[] nums, int k) {
		int times = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				if(sum == k) times++;
			}
		}
		return times;
	}
}
