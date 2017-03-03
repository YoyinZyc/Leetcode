package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Cactus
 * @category Array-medium unsolved
 * @version Create at: 2017年3月3日 上午11:45:35
 * 
 */
public class Pro39_Combination_Sum {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();
	HashMap<Integer, List<List<Integer>>> sumMap = new HashMap<Integer, List<List<Integer>>>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		
		
		Arrays.sort(candidates);
		int leftIndex = 0;
		int rightIndex = candidates.length-1;
		while (candidates[rightIndex] >= target) {
			if (candidates[rightIndex] == target) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(candidates[rightIndex]);
				lists.add(list);
			}
			rightIndex--;
		}
//		while(leftIndex <= rightIndex){
//			int sum = candidates[leftIndex] + candidates[rightIndex];
//			if (sum == target) {
//				List<Integer> list = new ArrayList<Integer>();
//				list.add(candidates[leftIndex]);
//				list.add(candidates[rightIndex]);
//				lists.add(list);
//				if (!sumMap.containsKey(candidates[leftIndex])) {
//					findNumCombination(candidates, target, 0, leftIndex-1);
//				}
//				if (!sumMap.containsKey(candidates[rightIndex])) {
//					findNumCombination(candidates, target, rightIndex+1, candidates.length-1);
//				}
//			}
//		}
		
		findNumCombination(candidates, target, leftIndex, rightIndex);
		for (int i = 0; i < sumMap.get(target).size(); i++) {
			
		}
		return lists;
	}
	
	public void findNumCombination(int[] candidates, int target, int leftIndex, int rightIndex){
		List<List<Integer>> sumPairs = new ArrayList<List<Integer>>();
		sumMap.put(target, sumPairs);
		while(leftIndex <= rightIndex){
			int sum = candidates[leftIndex] + candidates[rightIndex];
			if (sum == target) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(candidates[leftIndex]);
				list.add(candidates[rightIndex]);
//				lists.add(list);
				sumMap.get(target).add(list);
				if (!sumMap.containsKey(candidates[leftIndex])) {
					findNumCombination(candidates, target, 0, leftIndex-1);
				}
				if (!sumMap.containsKey(candidates[rightIndex])) {
					findNumCombination(candidates, target, rightIndex+1, candidates.length-1);
				}
			}
			
			leftIndex++;
			rightIndex--;
		}
	}
}
