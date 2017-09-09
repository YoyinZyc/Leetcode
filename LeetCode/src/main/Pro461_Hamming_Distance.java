package main;

/**
 * @author Cactus
 * @category TopLiked_Easy & Bit Manipulation
 * @version Create at: Sep 5, 2017 1:39:26 PM
 */
public class Pro461_Hamming_Distance {
	public int hammingDistance(int x, int y) {
		int z = x ^ y;
		int count = 0;
		while(z > 0) {
			if(z % 2 == 1) count++;
			z = z/2;
		}
		return count;
	}
}
