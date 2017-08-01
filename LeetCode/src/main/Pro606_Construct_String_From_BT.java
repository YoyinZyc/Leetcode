package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月1日 下午2:14:58
 * 
 */
public class Pro606_Construct_String_From_BT {
	public String tree2str(TreeNode t) {
		if(t== null){
			return "";
		}else{
			if (t.left == null ) {
				if (t.right == null) {
					return ""+t.val;
				}else{
					return t.val+"()("+tree2str(t.right)+")";
				}

			}else{
				if (t.right == null) {
					return t.val+"("+tree2str(t.left)+")";
				}else{
					return t.val+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
				}
			}
		}

	}
}
