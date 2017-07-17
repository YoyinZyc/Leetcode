package main;

import java.util.Stack;

/**
 * @author Cactus
 * @version Create at: 2017年7月17日 下午4:11:51
 * 
 */
public class Pro150_Evaluate_Reverse_Polish_Notation {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			switch (tokens[i]) {
			case "+":
				stack.push(stack.pop()+stack.pop());
				break;
			case "-":
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2-num1);
				break;
			case "*":
				stack.push(stack.pop()*stack.pop());
				break;
			case "/":
				int num3 = stack.pop();
				int num4 = stack.pop();
				stack.push(num4 / num3);
				break;
			default:
				stack.push(Integer.parseInt(tokens[i]));
				break;
			}
		}
		return stack.pop();

	}
}
