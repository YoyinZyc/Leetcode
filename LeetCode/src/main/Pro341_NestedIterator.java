package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月19日 下午1:30:56
 * 
 */
public class Pro341_NestedIterator implements Iterator<Integer>{
	
	List<Integer> list = new LinkedList<Integer>();
	
	public Pro341_NestedIterator(List<NestedInteger> nestedList) {
		flattenList(nestedList);
	}

	@Override
	public Integer next() {
		return list.remove(0);
	}

	@Override
	public boolean hasNext() {
		return !list.isEmpty();
	}
	
	private void flattenList(List<NestedInteger> nestedList) {
		for (int i = 0; i < nestedList.size(); i++) {
			if (nestedList.get(i).isInteger()) {
				list.add(nestedList.get(i).getInteger());
			}else {
				flattenList(nestedList.get(i).getList());
			}
		}
	}
}
