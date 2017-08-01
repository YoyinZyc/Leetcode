package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月1日 下午2:51:03
 * 
 */
public class Pro617_Merge_Two_BT {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}else if (t2 == null) {
			return t1;
		}
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

}
