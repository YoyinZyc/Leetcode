package main;
/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: 2017年8月23日 上午11:38:39
 * 
 */
public class Pro64_Minimum_Path_Sum {
	public int minPathSum(int[][] grid) {
		if(grid.length == 0) return 0;
        int[][] steps = new int[grid.length][grid[0].length];
		
		steps[0][0] = grid[0][0];
		for (int i = 1; i < steps.length; i++) {
			steps[i][0] = steps[i-1][0] + grid[i][0];
		}
		
		for (int i = 1; i < steps[0].length; i++) {
			steps[0][i] = steps[0][i-1] + grid[0][i];
		}
		
		
		for (int i = 1; i < steps.length; i++) {
			for (int j = 1; j < steps[i].length; j++) {
				steps[i][j] = grid[i][j] + Math.min(steps[i-1][j], steps[i][j-1]);
			}
		}
		return steps[grid.length-1][grid[0].length-1];
	}
}
