package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月18日 下午1:34:46
 * 
 */
public class Pro385_Mini_Parser {
	public NestedInteger deserialize(String s) {
		if (s.charAt(0) != '[') {
			return new NestedInteger(Integer.parseInt(s));
		}
		
		char[] elements = s.toCharArray();
		int i = 0;
		Stack<NestedInteger> stack = new Stack<NestedInteger>();
		String numString = "";
		while(i < elements.length) {
			if (elements[i] == '[') {
				stack.push(new NestedInteger());
			}else if (elements[i] == ',') {
				if (!numString.equals("")) {
					stack.peek().add(new NestedInteger(Integer.parseInt(numString)));
					numString = "";
				}
			}else if (elements[i] == ']') {
                if (!numString.equals("")) {
					stack.peek().add(new NestedInteger(Integer.parseInt(numString)));
					numString = "";
				}
				NestedInteger nestedInteger = stack.pop();
				if (stack.isEmpty()) {
					return nestedInteger;
				}
				stack.peek().add(nestedInteger);
			}else{
				numString += elements[i];
			}
			i++;
		}
		return new NestedInteger();
	}
}


