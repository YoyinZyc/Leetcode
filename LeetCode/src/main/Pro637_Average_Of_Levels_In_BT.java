package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月1日 下午3:05:15
 * 
 */
public class Pro637_Average_Of_Levels_In_BT {
	Map<Integer, Long> count = new HashMap<Integer, Long>();
	Map<Integer, Long> sum = new HashMap<Integer,Long>();
	public List<Double> averageOfLevels(TreeNode root) {
		helper(root, 1);
		List<Double> ave = new ArrayList<Double>();
		Iterator<Entry<Integer, Long>> iterator = count.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, Long> entry = iterator.next();
			ave.add(sum.get(entry.getKey())*1.0/entry.getValue());
		}
		return ave;
	}
	
	private void helper(TreeNode node, int level) {
		if (node == null) {
			return;
		}
		
		sum.put(level, sum.getOrDefault(level, new Long(0))+node.val);
		count.put(level, count.getOrDefault(level, new Long(0))+1);
		helper(node.left, level+1);
		helper(node.right, level+1);
	}
}
