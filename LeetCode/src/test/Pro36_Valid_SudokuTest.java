package test;

import static org.junit.Assert.*;
import main.Pro36_Valid_Sudoku;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月22日 下午1:09:01
 * 
 */
public class Pro36_Valid_SudokuTest {
	Pro36_Valid_Sudoku test = new Pro36_Valid_Sudoku();
	@Test
	public void test() {
		char[][] board = new char[9][9];
		String[] strs = {"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
		for (int i = 0; i < 9; i++) {
			board[i] = strs[i].toCharArray();
		}
		test.isValidSudoku(board);	
	}

}
