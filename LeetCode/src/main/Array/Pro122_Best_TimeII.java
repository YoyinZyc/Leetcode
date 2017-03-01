package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro122_Best_TimeII {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		
		int max = 0;
		int sofarMin = prices[0];
		int subMax = 0;
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < sofarMin) {
				sofarMin = prices[i];
			}
			
			if ((prices[i]-sofarMin)>subMax) {
				subMax = prices[i] - sofarMin;
			}else {
				max += subMax;
				sofarMin = prices[i];
				subMax = 0;
			}
			
		}
		max += subMax;
		return max;
		
	}
}
