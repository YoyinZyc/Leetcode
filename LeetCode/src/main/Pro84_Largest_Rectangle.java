package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Hard
 * @version Create at: 2017年7月22日 下午3:21:05
 * 
 */
public class Pro84_Largest_Rectangle {
	public int largestRectangleArea(int[] heights) {
		int i = 0;
		int maxArea = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		while (i < heights.length) {
			if (i == 0) {
				stack.push(i);
			}else{
				int k = 0; 
				while (stack.peek() != -1 && heights[i] < heights[stack.peek()]) {
					int popIndex = stack.pop();
					maxArea = Math.max(maxArea, heights[popIndex] * (i-stack.peek()-1));
				}
				stack.push(i);

			}
			i++;

		}
		while(stack.peek()!=-1) {

			maxArea = Math.max(maxArea, heights[stack.pop()] * (heights.length-stack.peek()-1));
		}
		return maxArea;
	}
}
