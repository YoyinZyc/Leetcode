package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月18日 下午8:02:52
 * 
 */
public class Pro289_Game_Of_Life {
	public void gameOfLife(int[][] board) {
		if (board.length == 0) {
			return;
		}
		
		int m = board[0].length-1;
		int n = board.length-1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				int oneCount = 0;
				if ((i-1 >= 0) && (j-1>=0)){
					if (isOne(board[i-1][j-1]))  oneCount++;
				}
				if (i-1 >= 0){
					if (isOne(board[i-1][j]))  oneCount++;
				}
				if ((i-1 >= 0) && (j+1<=m)){
					if (isOne(board[i-1][j+1]))  oneCount++;
				}
				if (j+1<=m){
					if (isOne(board[i][j+1]))  oneCount++;
				}
				if (j-1>=0){
					if (isOne(board[i][j-1]))  oneCount++;
				}
				if ((i+1 <= n) && (j-1>=0)){
					if (isOne(board[i+1][j-1]))  oneCount++;
				}
				if (i+1 <= n) {
					if (isOne(board[i+1][j]))  oneCount++;
				}
				if ((i+1 <= n) && (j+1<=m)){
					if (isOne(board[i+1][j+1]))  oneCount++;
				}
				
				if ((board[i][j] == 0)&&(oneCount == 3)) {
					board[i][j] = 2;
				}else if (board[i][j]==1) {
					if ((oneCount != 2)&&(oneCount != 3)) {
						board[i][j] = -1;
					}
				}
				
			}
		}
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (board[i][j] == -1) {
					board[i][j] = 0;
				}else if (board[i][j] == 2) {
					board[i][j] = 1;
				}
			}
		}
		
	}
	
	private boolean isOne(int num){
		return Math.abs(num) == 1? true:false;
	}
}
