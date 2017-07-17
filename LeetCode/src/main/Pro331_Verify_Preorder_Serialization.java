package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月17日 下午4:41:24
 * 
 */
public class Pro331_Verify_Preorder_Serialization {
	public boolean isValidSerialization(String preorder) {
		String[] tokens = preorder.split(",");
		Stack<String> stack = new Stack<String>();
		for (int i = tokens.length-1; i >= 0; i--) {
			if (tokens[i].equals("#")) {
				stack.push(tokens[i]);
			}else{
				try {
					stack.pop();
					stack.pop();
				} catch (Exception e) {
					// TODO: handle exception
					return false;
				}
				stack.push(tokens[i]);
			}
		}
		if (stack.size() == 1) {
			return true;
		}
		return false;
	}
}
