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
		for (int j = 0; j < prerequisites.length; j++) {
			preGraph[prerequisites[j][0]][prerequisites[j][1]] = 1;
		}
		int[] trueRecord = new int[numCourses];
		
		while(i < numCourses) {
			if(trueRecord[i] == 0 ) {
				int[] record = new int[numCourses];
				if(!dfs(i, preGraph,record, trueRecord)) return false; 
			}
			i++;
		}
		return true;
	}
	
	private boolean dfs(int i, int[][] preGraph, int[] record, int[] trueRecord) {
		record[i] = 1;
		for (int j = 0; j < preGraph[i].length; j++) {
			if(preGraph[i][j] == 1) {
				if (trueRecord[j] == 0) {
					if (record[j] == 0) {
						if(dfs(j, preGraph, record, trueRecord)) {
							trueRecord[j] = 1;
						}else {
							return false;
						}
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}
}
