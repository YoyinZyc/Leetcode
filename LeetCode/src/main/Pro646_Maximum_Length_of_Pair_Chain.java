package main;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 2, 2017 4:31:07 PM
 */
public class Pro646_Maximum_Length_of_Pair_Chain {
	public int findLongestChain(int[][] pairs) {
//		Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
	
		Arrays.sort(pairs, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a, int[] b) {
//				if(a[0] != b[0]) {
					return Integer.compare(a[1], b[1]);
//				}else {
//					return Integer.compare(a[1], b[1]);
//				}
			}
		});

		int i = 0;
		int j = 1;
		int ret = 1;
		while(j < pairs.length) {
			if (pairs[j][0] > pairs[i][1]) {
				ret++;
				i = j;
			}
			j++;
		}
		return ret;
	}

}
