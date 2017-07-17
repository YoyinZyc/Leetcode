package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Easy
 * @version Create at: 2017年7月15日 下午3:37:23
 * 
 */
public class Pro232_Stack_Queue {
	Stack<Integer> stack1,stack2;
	public Pro232_Stack_Queue() {
		// TODO Auto-generated constructor stub
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int ret = stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return ret;
	}

	/** Get the front element. */
	public int peek() {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int ret = stack2.peek();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return ret;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack1.empty(); 
	}
}
