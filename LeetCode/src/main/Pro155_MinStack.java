package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Easy
 * @version Create at: 2017年7月14日 下午5:38:03
 * 
 */
public class Pro155_MinStack {
	Stack<Integer> stack;
	Stack<Integer> minStack;

	public Pro155_MinStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int x) {
		if (stack.isEmpty()) {
			minStack.push(x);
		}else{
			minStack.push(minStack.peek()<x?minStack.peek():x);
		}
		stack.push(x);
		
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
