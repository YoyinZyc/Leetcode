package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/**
 * @author Cactus
 * @category TopLiked-Medium & Greedy
 * @version Create at: Sep 9, 2017 4:07:21 PM
 */
public class Pro621_Task_Scheduler {
	public int leastInterval(char[] tasks, int n) {
		int[] charTimes = new int[26];
		for (int i = 0; i < tasks.length; i++) {
			charTimes[tasks[i]-'A']++;
		}
		
		Arrays.sort(charTimes);
		int maxTime = 1;
		for (int i = charTimes.length-1; i > 0; i--) {
			if(charTimes[i-1] < charTimes[i]) {
				break;
			}else {
				maxTime++;
			}
		}
		
		return Math.max(tasks.length, (charTimes[charTimes.length-1]-1)*(n+1) + maxTime);
		
	}
}
