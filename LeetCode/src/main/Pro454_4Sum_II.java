package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年4月3日 下午8:31:58
 * 
 */
public class Pro454_4Sum_II {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int count = 0;
		int N = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		Arrays.sort(D);
		HashMap<Integer, Integer> aMap = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> bMap = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> cMap = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> dMap = new HashMap<Integer,Integer>();

		HashMap<Integer, Integer> sumMap = new HashMap<Integer,Integer>();
//		HashMap<Integer, Integer> map2 = new HashMap<Integer,Integer>();
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < N; i++) {
			int countA = 1;
			while((i < N-1)&&(A[i+1] == A[i])){
				countA++;
				i++;
			}
			aMap.put(A[i], countA);
		}
		for (int i = 0; i < N; i++) {
			int countB = 1;
			while((i < N-1)&&(B[i+1] == B[i])){
				countB++;
				i++;
			}
			bMap.put(B[i], countB);
		}
		for (int i = 0; i < N; i++) {
			int countC = 1;
			while((i < N-1)&&(C[i+1] == C[i])){
				countC++;
				i++;
			}
			cMap.put(C[i], countC);
		}
		for (int i = 0; i < N; i++) {
			int countD = 1;
			while((i < N-1)&&(D[i+1] == D[i])){
				countD++;
				i++;
			}
			dMap.put(D[i], countD);
		}
		for (Iterator iterator = aMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> a = (Entry<Integer, Integer>) iterator.next();
			for (Iterator iterator2 = bMap.entrySet().iterator(); iterator2.hasNext();) {
				Entry<Integer, Integer> b = (Entry<Integer, Integer>) iterator2.next();
				if (sumMap.get(a.getKey()+b.getKey())!=null) {
					sumMap.put(a.getKey()+b.getKey(), sumMap.get(a.getKey()+b.getKey())+a.getValue()*b.getValue());
				}else{
					sumMap.put(a.getKey()+b.getKey(), a.getValue()*b.getValue());
					set.add(a.getKey()+b.getKey());
				}
			}
		}
		for (Iterator iterator = cMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> c = (Entry<Integer, Integer>) iterator.next();
			for (Iterator iterator2 = dMap.entrySet().iterator(); iterator2.hasNext();) {
				Entry<Integer, Integer> d = (Entry<Integer, Integer>) iterator2.next();
				if (set.contains(0-c.getKey()-d.getKey())) {
					count+=sumMap.get(0-c.getKey()-d.getKey())*c.getValue()*d.getValue();
				}
			}	
		}
		return count;
	}


}
