package main;

/**
 * @author Cactus
 * @category TwoPoints_Medium
 * @version Create at: Sep 10, 2017 10:42:18 AM
 */
public class Pro75_Sort_Colors {
	public void sortColors(int[] nums) {
		int i = 0;
		int j = nums.length-1;
		int i2 = 0;


		while(i2 <= j) {
			if(nums[i2] == 0) {
				if(i2 == i) {
					i2++;
					i++;
				}else {
					nums[i2] = nums[i];
					nums[i] = 0;
					i++;
				}
			}else if(nums[i2] == 1) {
				i2++;
			}else {
				nums[i2] = nums[j];
				nums[j] = 2;
				j--;
			}
		}

	}
}
