package main.Array;

public class Pro27_Remove_Element {
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		
		int newIndex = 0;
		int oldIndex = 0;
		while(oldIndex < nums.length){
			if (nums[oldIndex] != val) {
				nums[newIndex] = nums[oldIndex];
				newIndex++;
			}
			oldIndex++;
		}
		return newIndex;
	}
}
