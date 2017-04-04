package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年3月31日 下午4:15:54
 * 
 */
public class Pro508_Frequent_Subtree_Sum {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int maxTimes = 0;

	public int[] findFrequentTreeSum(TreeNode root) {
		if (root == null) {
			int ret[] = new int[0];
			return ret;
		}
		List<Integer> list = new ArrayList<Integer>();
		sumOfSubtree(root);
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator(); 
		for (; iterator.hasNext();) {
			Entry<Integer,Integer> entry = (Entry<Integer, Integer>) iterator.next();
			if (entry.getValue() == maxTimes) {
				list.add(entry.getKey());
			}
		}
		int [] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

	private int sumOfSubtree(TreeNode root) {
		int sum = root.val;
		if (root.left != null) {
			sum+=sumOfSubtree(root.left);
		}
		if(root.right!=null){
			sum+=sumOfSubtree(root.right);
		}
		if (map.containsKey(sum)) {
			int value = map.get(sum);
			map.put(sum, ++value);
			maxTimes = maxTimes > value?maxTimes:value;
		}else{
			map.put(sum, 1);
			maxTimes = maxTimes > 1?maxTimes:1;
		}
		return sum;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}