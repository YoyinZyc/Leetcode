package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月18日 下午5:47:28
 * 
 */
public class Pro394_Decode_String {
	public String decodeString(String s) {
		char []tokens = s.toCharArray();
		Stack<Integer> times = new Stack<Integer>();
		Stack<String> strings = new Stack<String>();
		strings.push("");
		int i = 0;
		String timeString = "";
		
		while(i < tokens.length) {
			if (tokens[i] == '[') {
				if (timeString.equals("")) {
					times.push(0);
				}else{
					times.push(Integer.parseInt(timeString));
				}
				strings.push("");
				timeString = "";
			}else if (tokens[i] == ']') {
				String peek = strings.pop();
				String afterRepeat = "";
				int time = times.pop();
				for (int j = 0; j < time; j++) {
					afterRepeat+=peek;
				}
				
				strings.push(strings.pop() + afterRepeat);
				
				
			}else if ((tokens[i]>='0') && (tokens[i] <= '9')) {
				timeString+=tokens[i];
			}else {
				strings.push(strings.pop()+tokens[i]);
			}
			i++;
		}
		return "";
	}
}
