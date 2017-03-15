package main.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月15日 下午2:53:35
 * 
 */
public class Pro54_Spiral_Matrix {
public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0) return list;
		int m = matrix[0].length;
		int n = matrix.length;
		
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				list.add(matrix[i][0]);
			}
			return list;
		}
		if (n == 1) {
			for (int i = 0; i < m; i++) {
				list.add(matrix[0][i]);
			}
			return list;
		}
		
		int xIndex = m;
		int yIndex = n;
		while ((xIndex>(m+1)/2) && (yIndex>(n+1)/2)) {
			for (int i = m-xIndex; i < xIndex-1; i++) {
				list.add(matrix[n-yIndex][i]);
			}
			for (int i = n-yIndex; i < yIndex-1; i++) {
				list.add(matrix[i][xIndex-1]);
			}
			for (int i = xIndex-1; i > m-xIndex; i--) {
				list.add(matrix[yIndex-1][i]);
			}
			for (int i = yIndex-1; i > n-yIndex; i--) {
				list.add(matrix[i][m-xIndex]);
			}
			
			xIndex--;
			yIndex--;
		}
		
if (m%2 == 1) {
			if (n%2 == 1) {
				if(m >= n) {
			    	for (int i = m-xIndex; i < xIndex; i++) {
						list.add(matrix[n-yIndex][i]);
					}
			    }else{
			    	for (int i = n-yIndex; i < yIndex; i++) {
						list.add(matrix[i][xIndex-1]);
					}
			    }
			}else {
				if (m < n) {
					for (int i = n-yIndex; i < yIndex; i++) {
						list.add(matrix[i][xIndex-1]);
					}
				}
			}
		}else {
			if ((n%2 == 1) && (n < m)){
				for (int i = m-xIndex; i < xIndex; i++) {
					list.add(matrix[n-yIndex][i]);
				}
			}
		}
		
		return list;
    }
}
