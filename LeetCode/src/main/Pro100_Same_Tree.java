package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 上午10:44:45
 * 
 */
public class Pro100_Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q==null){
			return true;
		}else if(p != null && q != null) {
			return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}else {
			return false;
		}
	}
}
