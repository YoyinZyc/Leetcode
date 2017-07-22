package main;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月21日 下午12:20:12
 * 
 */
public class Pro636_Exclusive_Time {
	public int[] exclusiveTime(int n, List<String> logs) {
		int[] ret = new int[n];
		int lastTimeStamp = -1;
//		int lastFunc = -1;
		int isStart = 0;
		Stack<Integer> funcStack = new Stack<Integer>();
		
		for (int i = 0; i < logs.size(); i++) {			
			String[] strs = logs.get(i).split(":");
			int func = Integer.parseInt(strs[0]);
			int time = Integer.parseInt(strs[2]);
			if (strs[1].equals("start")) {
				if (!funcStack.isEmpty()) {
					if (isStart == 0) {
						ret[funcStack.peek()] += time-lastTimeStamp-1;
					}else {
						ret[funcStack.peek()] += time-lastTimeStamp;
					}
				}
				isStart = 1;
				funcStack.push(func);
			}else {
				ret[func] += time - lastTimeStamp;
				if (isStart == 1) {
					ret[func] += 1;
				}
				funcStack.pop();
				isStart = 0;
			}
			lastTimeStamp = time;
//			lastFunc = func;
		}
		return ret;
	}
}
