package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro289_Game_Of_Life;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月18日 下午8:32:07
 * 
 */
public class Pro289_Game_Of_LifeTest {
	Pro289_Game_Of_Life test = new Pro289_Game_Of_Life();
	@Test
	public void test() {
		int board[][] = {{1,0,1,0},{0,1,0,1},{1,1,0,0}};
		test.gameOfLife(board);
	}

}
