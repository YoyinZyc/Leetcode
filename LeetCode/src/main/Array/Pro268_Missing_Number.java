package main.Array;

public class Pro268_Missing_Number {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		int sum1 = (1+length) * length/2;
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum2 += nums[i];
		}
		return (sum1-sum2);
	}
}
