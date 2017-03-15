package main.Array;
/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月14日 下午6:29:45
 * 
 */
public class Pro48_Rotate_Image {
	public void rotate(int[][] matrix) {
		for (int i = 0; i <= (matrix.length-1)/2; i++) {
			int j = i;
			while(j < matrix.length-1-i) {
				int k = 0;
				int toX = i;
				int toY = j;
				int temp = matrix[toX][toY];
				while(k < 3) {
					int fromX = matrix.length- 1 - toY;
					int fromY = toX;
					matrix[toX][toY] = matrix[fromX][fromY];
					toX = fromX;
					toY = fromY;
					k++;
				}
				matrix[toX][toY] = temp;
				j++;
			}
		}	
	}
}
/*
 * clockwise rotate
 * first reverse up to down, then swap the symmetry 
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
*/
/*
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
*/