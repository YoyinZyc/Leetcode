package main;
/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 下午4:42:21
 * 
 */
public class Pro463_Island_Perimeter {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		int m = grid.length;
		int n = grid[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					if((i-1<0) || (grid[i-1][j] == 0)) perimeter++;
					if((i+1>m) || (grid[i+1][j] == 0)) perimeter++;
					if((j-1<0) || (grid[i][j-1] == 0)) perimeter++;
					if((j+1>n) || (grid[i][j+1] == 0)) perimeter++;
				}
			}
		}
		return perimeter;
	}
}
