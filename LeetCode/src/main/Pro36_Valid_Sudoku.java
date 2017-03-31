package main;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年3月22日 上午11:05:57
 * 
 */
public class Pro36_Valid_Sudoku {
	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer, HashSet<Character>> map = new HashMap<Integer,HashSet<Character>>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					if (map.get(0-i-1) == null) {
						HashSet<Character> set = new HashSet<Character>();
						set.add(board[i][j]);
						map.put(0-i-1, set);
					}else{
						if(!map.get(0-i-1).add(board[i][j])) return false;
					}
					
					if (map.get(j+1) == null) {
						HashSet<Character> set = new HashSet<Character>();
						set.add(board[i][j]);
						map.put(j+1, set);
					}else {
						if(!map.get(j+1).add(board[i][j])) return false;
					}
					
					if (map.get((i/3)*3+j/3+10) == null) {
						HashSet<Character> set = new HashSet<Character>();
						set.add(board[i][j]);
						map.put((i/3)*3+j/3+10, set);
					}else {
						if(!map.get((i/3)*3+j/3+10).add(board[i][j])) return false;
					}
				}
				
			}
		}
		return true;
	}
}
