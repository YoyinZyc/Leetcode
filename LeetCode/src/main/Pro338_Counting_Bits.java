package main;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 2, 2017 3:00:04 PM
 */
public class Pro338_Counting_Bits {
	public int[] countBits(int num) {
		
		int[] ret = new int[num+1];
		if(num == 0) return null;
		ret[0] = 0;
		ret[1] = 1;
		int i = 2;
		while(i < num+1) {
			if(i % 2 == 0) {
				ret[i] = ret[i/2];
			}else {
				ret[i] = ret[i/2] + 1;
			}
			i++;
		}
		return ret;
	}
}

