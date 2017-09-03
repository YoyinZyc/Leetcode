package main;

/**
 * @author Cactus
 * @category DP_Mediums
 * @version Create at: Sep 2, 2017 2:25:33 PM
 */
public class Pro63_Unique_Path_II {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid.length == 0) {
			return 0;
		}
        if(obstacleGrid[0][0] == 1) {
            return 0;
        }else{
            obstacleGrid[0][0] = 1;
        }
        
		for (int i = 1; i < obstacleGrid.length; i++) {
			if (obstacleGrid[i][0] == 1) {
				obstacleGrid[i][0] = 0;
			}else {
				obstacleGrid[i][0] = obstacleGrid[i-1][0];
			}
		}
		
		for (int i = 1; i < obstacleGrid[0].length; i++) {
			if (obstacleGrid[0][i] == 1) {
				obstacleGrid[0][i] = 0;
			}else {
				obstacleGrid[0][i] = obstacleGrid[0][i-1];
			}
		}
		
		for (int i = 1; i < obstacleGrid.length; i++) {
			for (int j = 1; j < obstacleGrid[0].length; j++) {
				if (obstacleGrid[i][j] != 1) {
					obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
				}else {
					obstacleGrid[i][j] = 0;
				}
			}
		}
		return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
		
	}
}
