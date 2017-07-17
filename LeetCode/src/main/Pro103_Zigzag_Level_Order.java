package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月17日 下午2:35:24
 * 
 */
public class Pro103_Zigzag_Level_Order {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if(root == null) return lists;
		stack1.push(root);
		boolean isFromRight = false;
		while(!stack1.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			while(!stack1.isEmpty()){
				TreeNode node = stack1.pop();
				list.add(node.val);
				if(isFromRight){
					if (node.right!=null) {
						stack2.push(node.right);
					}
					if(node.left != null) {
						stack2.push(node.left);
					}
                    
				}else{
					if(node.left != null) {
						stack2.push(node.left);
					}
					if (node.right!=null) {
						stack2.push(node.right);
					}
				}
			}
			lists.add(list);
			Stack<TreeNode> temp = stack1;
			stack1 = stack2;
			stack2 = temp;
            isFromRight = isFromRight == true?false:true;
		}
		return lists;
		
	}
}
