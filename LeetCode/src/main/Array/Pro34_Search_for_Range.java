package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月14日 下午2:44:47
 * 
 */
public class Pro34_Search_for_Range {
	int [] ret = {-1,-1};
	int [] nums;
	int target;
	public int[] searchRange(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
		if(nums.length == 0) return ret;

		binarySearch(0,nums.length-1);
		return ret;
	}

	private void binarySearch(int start, int end) {
		if (start > end) {
			return;
		}
		int mid = start + (end-start)/2;
		if(nums[mid] == target){
			ret[0] = mid;
			ret[1] = mid;
			findBottom(start, mid-1);
			findTop(mid+1,end);
		}else if(nums[mid] < target) {
			binarySearch(mid+1, end);
		}else {
			binarySearch(start, mid-1);
		}	

	}

	private void findBottom (int start, int end) {
		if (start > end) {
			return;
		}
		int mid = start + (end-start)/2;
		if (nums[mid] == target) {
			ret[0] = mid;
			findBottom(start, mid-1);
		}else if(nums[mid] < target) {
			findBottom(mid+1, end);
		}
	}

	private void findTop (int start, int end) {
		if(start > end) return;
		int mid = start + (end-start)/2;
		if (nums[mid] == target) {
			ret[1] = mid;
			findTop(mid+1, end);
		}else if (nums[mid] > target) {
			findTop(start, mid-1);
		}
	}
}
