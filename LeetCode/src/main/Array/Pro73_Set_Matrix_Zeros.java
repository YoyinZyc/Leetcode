package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月17日 下午6:54:24
 * 
 */
public class Pro73_Set_Matrix_Zeros {
	public void setZeroes(int[][] matrix) {
		int m = matrix[0].length;
		int n = matrix.length;
		
		int row = 0;
		int col = 0;
		
		int zeroInCol = 0;
		int zeroInRow = 0;
		boolean hasZero = false;
		All:
		for (; row < n; row++) {
			zeroInCol = 0;
			for (; zeroInCol < m; zeroInCol++) {
				if (matrix[row][zeroInCol] == 0) {
					hasZero = true;
					break All;
				}
			}
		}
		
		if (!hasZero)  return;
		
		All2:
		for (; col < zeroInCol; col++) {
			zeroInRow = row+1;
			for (; zeroInRow < n; zeroInRow++) {
				if (matrix[zeroInRow][col] == 0) {
					break All2;
				}
			}
		}
		
//		matrix[row][col] = 0;
		
		
		for (int i = row+1; i < n; i++) {
			for (int j = col+1; j < m; j++) {
				if (matrix[i][j] == 0) {
					matrix[row][j] = 0;
					matrix[i][col] = 0;
				}
			}
		}
		
		int i = 0;
		while(i < m){
			if (i == col) {
				i++;
				continue;
			}
			if (matrix[row][i] == 0) {
				for (int j = 0; j < row; j++) {
					matrix[j][i] = 0;
				}
				for (int j = row+1; j < n; j++) {
					matrix[j][i] = 0;
				}
			}
			i++;
		}
		
		i = 0;
		while(i < n){
			if (i == row) {
				i++;
				continue;
			}
			if (matrix[i][col] == 0) {
				for (int j = 0; j < col; j++) {
					matrix[i][j] = 0;
				}
				for (int j = col+1; j < m; j++) {
					matrix[i][j] = 0;
				}
			}
			i++;
		}
		
		for (int k = 0; k < m; k++) {
			matrix[row][k] = 0;
		}
		for (int k = 0; k < n; k++) {
			matrix[k][col] = 0;
		}
		
	}
}
