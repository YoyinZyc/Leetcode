package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Easy
 * @version Create at: 2017年7月13日 下午4:05:28
 * 
 */
public class Pro20_Valid_Parentheses {
	public boolean isValid(String s) {
		Stack<Character> charStack = new Stack<Character>();
		charStack.push('0');
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(((chars[i]-charStack.peek()) == 1)||((chars[i]-charStack.peek()) == 2)){
				charStack.pop();
			}else {
				charStack.push(chars[i]);
			}
		}
		if (charStack.peek() == '0') {
			return true;
		}else {
			return false;
		}
	}
	

}
