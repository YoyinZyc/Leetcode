package main;
/**
 * @author Cactus
 * @category DP_Easy
 * @version Create at: 2017年8月22日 上午9:05:26
 * 
 */
public class Pro70_Climbing_Stairs {
	public int climbStairs(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}else if (n ==2) {
			return 2;
		}
		int[] stairs = new int[n+1];
		stairs[1] = 1;
		stairs[2] = 2;
		int i = 3;
		while (i < n+1) {
			stairs[i] = stairs[i-1] + stairs[i-2];
			i++;
		}

		return stairs[n];
	}
}
