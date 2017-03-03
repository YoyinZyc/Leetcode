package main.Array;

import java.util.List;

/**
 * @author Cactus
 * @category Array-medium
 * @version Create at: 2017年3月2日 下午6:08:48
 * 
 */
public class Pro120_Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int sum = 0;
		int lines[] = new int[triangle.size()+1];
		for (int i = triangle.size()-1; i >= 0; i--) {
			
//			int mini = triangle.get(i).get(0);
			List<Integer> line = triangle.get(i);
			for (int j = 0; j < line.size(); j++) {
				lines[j] = Math.min(lines[j],lines[j+1]) + line.get(j);
			}
//			sum += mini;
		}
		
		return lines[0];
	}
}
