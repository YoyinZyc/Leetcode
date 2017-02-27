package main.Array;

import java.util.ArrayList;
import java.util.List;

public class Pro118_Pascal_TriangleI {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		if (numRows >= 1) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			lists.add(list);
		}else {
			return lists;
		}
		
		if (numRows>=2) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(1);
			lists.add(list);
		}else {
			return lists;
		}
		
		for (int i = 2; i < numRows; i++) {
			List<Integer> leftList = lists.get(i-1);
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			for (int j = 0; j < i-1; j++) {
				list.add(leftList.get(j) + leftList.get(j+1));
			}
			list.add(1);
			lists.add(list);
		}
		
		return lists;

	}
	
	public void test() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(0,2);
		System.out.println(list1.get(0));
		System.out.println(list1.size());
		List2 = list1;
		list1.clear();
		
	}
}
