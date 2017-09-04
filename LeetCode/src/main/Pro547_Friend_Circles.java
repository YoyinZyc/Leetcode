package main;

import java.util.HashSet;

/**
 * @author Cactus
 * @category DSP_Medium
 * @version Create at: Sep 4, 2017 10:58:19 AM
 */
public class Pro547_Friend_Circles {
	public int findCircleNum(int[][] M) {
		HashSet<Integer> record = new HashSet<Integer>();
		int count = 0;
		int i = 0;
		while(i < M.length) {
			if (record.add(i)) {
				count++;
				dfs(M, record, i);
			}
			i++;
		}
		return count;
	}

	private void dfs(int[][] M, HashSet<Integer> record, int i) {
		for (int j = 0; j < M.length; j++) {
			if(M[i][j] == 1 && record.add(j)) 
				dfs(M, record, j);
		}
	}

}
