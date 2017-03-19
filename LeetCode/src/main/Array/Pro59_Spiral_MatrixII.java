package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月18日 下午7:01:10
 * 
 */
public class Pro59_Spiral_MatrixII {
	public int[][] generateMatrix(int n) {
		int[][] ret = new int[n][n];
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart = 0;
		int colEnd = n-1;

		int numCount = 1;
		while(numCount <= n*n) {
			for (int i = colStart; i <= colEnd; i++) {
				ret[rowStart][i] = numCount;
				numCount++;
			}
			rowStart+=1;
			for (int i = rowStart; i <= rowEnd; i++) {
				ret[i][colEnd] = numCount;
				numCount++;
			}
			colEnd-=1;
			for (int i = colEnd; i >= colStart; i--) {
				ret[rowEnd][i] = numCount;
				numCount++;
			}
			rowEnd-=1;
			for (int i = rowEnd; i >= rowStart; i--) {
				ret[i][colStart] = numCount;
				numCount++;
			}
			colStart+=1;
		}
		return ret;
	}
}
