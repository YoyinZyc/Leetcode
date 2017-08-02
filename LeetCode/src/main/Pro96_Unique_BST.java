package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月2日 下午3:49:34
 * 
 */
public class Pro96_Unique_BST {
	public int numTrees(int n) {
		int[] nums = new int[n+1];
		nums[0] = 1;
		nums[1] = 1;
		int index = 2;
		while (index <= n) {
			for (int i = 0; i < index; i++) {
				nums[index] += nums[i] * nums[index-1-i];
			}
			index++;
		}
		return nums[n];
	}
}
