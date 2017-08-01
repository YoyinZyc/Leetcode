package main;
/**
 * @author Cactus
 * @category Tree-Easy  
 * @version Create at: 2017年8月1日 下午12:31:07
 * 
 */
public class Pro572_Subtree_Of_Another_Tree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s==null && t==null) {
			return true;
		}else if (s==null && t!=null) {
			return false;
		}else if (s!=null&&t==null) {
			return true;
		}else{
			if (s.val == t.val) {
				return isSubtree(s.left, t) || isSubtree(s.right, t) 
						|| (isSubtreeFrom(s.left, t.left) && isSubtreeFrom(s.right, t.right)); 
			}else {
				return isSubtree(s.left, t) || isSubtree(s.right, t) ;
			}
		}
	}
	
	private boolean isSubtreeFrom(TreeNode s, TreeNode t){
		if (s == null && t == null) {
			return true;
		}
		if (s.val != t.val) {
			return false;
		}
		return isSubtreeFrom(s.left, t.left) && isSubtreeFrom(s.right, t.right);
	}
}
