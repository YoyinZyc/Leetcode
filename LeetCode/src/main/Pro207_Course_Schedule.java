package main;

/**
 * @author Cactus
 * @category DFS_Medium
 * @version Create at: Sep 4, 2017 4:17:56 PM
 */
public class Pro207_Course_Schedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int i = 0;
		int[][] preGraph = new int[numCourses][numCourses];
		for (int j = 0; j < preGraph.length; j++) {
			preGraph[prerequisites[j][0]][prerequisites[j][1]] = 1;
		}
		int[] record = new int[numCourses];
		while(i < numCourses) {
			if(record[i] == 0 ) {
				if(!dfs(i, preGraph,record)) return false; 
			}
			i++;
		}
		return true;
	}
	
	private boolean dfs(int i, int[][] preGraph, int[] record) {
		record[i] = 1;
		for (int j = 0; j < preGraph[i].length; j++) {
			if(preGraph[i][j] == 1) {
				if(record[j] == 0) {
					dfs(j, preGraph, record);
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
