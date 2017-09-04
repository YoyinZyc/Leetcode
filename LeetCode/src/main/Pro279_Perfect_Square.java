package main;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 4:25:15 PM
 */
public class Pro279_Perfect_Square {
	public int numSquares(int n) {
		int[] perNums = new int[n];
		perNums[0] = 1;
		int i = 1;
		while(i < n) {
			int sqrt = (int) Math.sqrt(i+1);
			if(Math.pow(sqrt, 2) == i+1) {
				perNums[i] = 1;
				i++;
				continue;
			}
			for (int j = 0; j < (i+1)/2; j++) {
				if (perNums[i] != 0) {
					perNums[i] = Math.min(perNums[i],perNums[j]+perNums[i-j-1]);
				}else{
					perNums[i] = perNums[j]+perNums[i-j-1];
				}
			}
			i++;
		}
		return perNums[n-1];
	}
}
