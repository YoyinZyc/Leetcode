package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro121_Best_Time {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				int sub = prices[j] - prices[i];
				if (sub <= 0) {
					break;
				}
				max = Math.max(sub,max);
			}
		}
		
		return max;
	}
}
