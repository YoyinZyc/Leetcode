package test;

import static org.junit.Assert.*;

import java.awt.Robot;

import javax.swing.RootPaneContainer;

import main.Pro173_BSTInterator;
import main.TreeNode;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月19日 下午6:09:07
 * 
 */
public class Pro173_BSTInteratorTest {
	Pro173_BSTInterator test ;
	@Test
	public void test() {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		test = new Pro173_BSTInterator(root);
		while(test.hasNext()) test.next();
	}

}
