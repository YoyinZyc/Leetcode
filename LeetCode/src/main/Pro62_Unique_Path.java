package main;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 2, 2017 12:05:23 PM
 */
public class Pro62_Unique_Path {
	public int uniquePaths(int m, int n) {
		if (m == 0) {
			return 0;
		}
		int countpath[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			countpath[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			countpath[0][i] = 1; 
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				countpath[i][j] = countpath[i-1][j] + countpath[i][j-1];
			}
		}
		return countpath[m-1][n-1];
	}
}
