package main;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 下午3:55:33
 * 
 */
public class Pro447_Number_Of_Boomerangs {
	public int numberOfBoomerangs(int[][] points) {
		int times = 0;
		int[][] distances = new int[points.length][points.length];
		for (int i = 0; i < points.length; i++) {
			for (int j = i; j < points.length; j++) {
				int distance = (int) (Math.pow(points[i][0]-points[j][0],2)+Math.pow(points[i][1]-points[j][1],2));
				distances[i][j] = distances[j][i] = distance;
			}
		}
		for (int i = 0; i < points.length; i++) {
			Arrays.sort(distances[i]);
			int j = 0;
			int count = 0;
			while(j+1 < points.length){
				if(distances[i][j] == distances[i][j+1]){
					count++;
				}else {
					times+=count*(count-1);
					count = 0;
				}
				j++;
			}
			times += count*(count-1);
		}
		return times;
	}
}

