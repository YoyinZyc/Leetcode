package main;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 12:58:57 PM
 */
public class Pro221_Maximal_Square {
	public int maximalSquare(char[][] matrix) {
		
		if(matrix.length == 0 )return 0;
		int i = 1;
		int m = matrix.length;
		int n = matrix[0].length;
		int maxSquare = 0;
		
		int[][] matrixInt = new int[m][n];
		for (int j = 0; j < m; j++) {
			for (int j2 = 0; j2 < n; j2++) {
				matrixInt[j][j2] = matrix[j][j2]-'0';
			}
		}
		
		while(i <= Math.min(m, n)) {
			int max = 0;
			for (int j = 0; j < m-i+1; j++) {

				for (int j2 = 0; j2 < n-i+1; j2++) {
					if (i == 1) {
						max = Math.max(matrixInt[j][j2], max);
					}else {
						int sum = sum(matrixInt, j, j2);
						max = Math.max(sum, max);
						matrixInt[j][j2] = sum;
					}
				}
			}
			if (max != Math.pow(2,2 * (i-1))) {
				return maxSquare;
			}else {
				maxSquare = (int) Math.pow(i, 2);
			}
			i++;
		}
		return maxSquare;
	}

	private int sum(int[][] matrix, int m, int n) {
		int sum = 0;
		for (int j = 0; j < 2; j++) {
			for (int j2 = 0; j2 < 2; j2++) {
				sum += matrix[m+j][n+j2];
			}
		}
		return sum;
	}
}
