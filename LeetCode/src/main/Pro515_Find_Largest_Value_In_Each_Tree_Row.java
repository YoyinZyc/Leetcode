package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月1日 下午5:35:24
 * 
 */
public class Pro515_Find_Largest_Value_In_Each_Tree_Row {
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> largestValues(TreeNode root) {
		helper(root, 0);
		return list;
	}
	
	private void helper(TreeNode node, int level) {
		if(node == null) return;
		
		if (list.size()<=level) {
			list.add(level,node.val);
		}else{
			if (list.get(level) < node.val){
				list.set(level, node.val);
			}
		}
		helper(node.left, level+1);
		helper(node.right, level+1);
	}
}
