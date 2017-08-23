package main;
/**
 * @author Cactus
 * @category NP_Easy Pro303
 * @version Create at: 2017年8月23日 上午10:25:47
 * 
 */
public class NumArray {
	int[] sums;
	int[] nums;
	public NumArray(int[] nums) {
		this.nums = nums;
		sums = new int[nums.length];
		int i = 0;
		int sum = 0;
		while(i < nums.length) {
			sum+=nums[i];
			sums[i] = sum;
			i++;
		}
	}

	public int sumRange(int i, int j) {
		return sums[j]-sums[i]+nums[i];
	}
}
