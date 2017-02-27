package main.Array;

public class Pro189_Rotate_Array {
	public void rotate(int[] nums, int k) {


		k = k>=nums.length ? (k-nums.length):k;

		if ((k <= 0) || (nums.length <= 1)){
			return;
		}
		int temp[] = new int[k];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = nums[i];
			nums[i] = nums[nums.length-k+i];
		}
		for (int i = nums.length-k-1; i >= k; i--) {
			nums[i+k] = nums[i];
		}

		int i = temp.length;
		while((i<nums.length)&&((i-temp.length)<temp.length)){
			nums[i] = temp[i-temp.length];
			i++;
		}

	}


}
