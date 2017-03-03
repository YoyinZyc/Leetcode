package main.Array;
/**
 * @category Array-medium
 * @author Cactus
 * @version Create at: 2017年3月3日 下午5:03:58
 * 
 */
public class Pro209_Minimum_Size_Subarray_Sum {
	public int minSubArrayLen(int s, int[] nums) {
		int length = nums.length;
		int startIndex = 0;
		int sumSofar = 0;
		int index = 0;
		
		while ((startIndex < nums.length)&&(index < nums.length)) {
			sumSofar += nums[index];
			while(sumSofar >= s){
				length = Math.min(index-startIndex+1, length);
				sumSofar -= nums[startIndex];
				startIndex++;
			}
			
			index++;
			
		}
		
		if (startIndex == 0) {
			return 0;
		}
		return length;
	}
}
