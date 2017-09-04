package main;

import javax.swing.InputMap;

/**
 * @author Cactus
 * @category DSP_Medium
 * @version Create at: Sep 4, 2017 2:26:17 PM
 */
public class Pro200_Number_Of_Islands {
	public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
		int count = 0;
		int[][] visited = new int[grid.length][grid[0].length];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[0].length; j++) {
				if(visited[i][j] == 0 && grid[i][j] == '1') {
					count++;
					dfs(grid, visited, i, j);
				}
			}
		}
		return count;
	}

	private void dfs(char[][] grid, int[][] visited, int i, int j) {
		int m = grid.length;
		int n = grid[0].length;
		up(grid, visited, i, j);
		down(grid, visited, i, j);
		left(grid, visited, i, j);
		right(grid, visited, i, j);
		
	}
	
	private void left(char[][] grid, int[][] visited, int i, int j) {
		if(j-1 >= 0 && grid[i][j-1] == '1' && visited[i][j-1] == 0) {
			visited[i][j-1] = 1;
			dfs(grid, visited, i, j-1);
		}
	}
	private void right(char[][] grid, int[][] visited, int i, int j) {
		if(j+1 < grid[0].length && grid[i][j+1] == '1' && visited[i][j+1] == 0) {
			visited[i][j+1] = 1;
			dfs(grid, visited, i, j+1);
		}
	}
	private void up(char[][] grid, int[][] visited, int i, int j) {
		if(i-1 >= 0 && grid[i-1][j] == '1' && visited[i-1][j] == 0) {
			visited[i-1][j] = 1;
			dfs(grid, visited, i-1, j);
		}
	}
	private void down(char[][] grid, int[][] visited, int i, int j) {
		if(i+1 < grid.length && grid[i+1][j] == '1' && visited[i+1][j] == 0) {
			visited[i+1][j] = 1;
			dfs(grid, visited, i+1, j);
		}
	}
}
