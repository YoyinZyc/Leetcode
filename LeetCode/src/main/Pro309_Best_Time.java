package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 9:12:24 PM
 */
public class Pro309_Best_Time {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int i = 1;
		int[][] status = new int[prices.length][4];
		
		status[0][0] = 0-prices[0];
		status[0][1] = Integer.MIN_VALUE;
		status[0][2] = 0;
		status[0][3] = Integer.MIN_VALUE;
		while(i < prices.length) {
			status[i][0] = status[i-1][2] - prices[i];
			status[i][1] = Math.max(status[i-1][0], status[i-1][1]);
			status[i][2] = Math.max(status[i-1][2], status[i-1][3]);
			status[i][3] = Math.max(status[i-1][0]+prices[i], status[i-1][1]+prices[i]);
			i++;
		}
		Arrays.sort(status[prices.length-1]);
		return status[prices.length-1][3];
	}
}
