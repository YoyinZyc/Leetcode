package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月15日 下午5:51:01
 * 
 */
public class Pro71_Simplify_Path {
	public String simplifyPath(String path) {
		Stack<String> stacks = new Stack<String>();
		String[] names = path.split("/");

		int index = 0;
		while (index<names.length){
			if ((!names[index].equals("")) && (!names[index].equals("."))) {
				if (names[index].equals("..")){
                    if(!stacks.isEmpty())
					stacks.pop();
				}else {
					stacks.push(names[index]);
				}
			}
            index++;
		}
        if (stacks.isEmpty()) {
			return "/";
		}
		String ret = "";
		while (!stacks.isEmpty()) {
			 ret = "/" + stacks.pop() + ret;
		}
		return ret;
	}
}
