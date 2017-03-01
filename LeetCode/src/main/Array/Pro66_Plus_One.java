package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro66_Plus_One {
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length-1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}
		int [] newDigits = new int[length+1];
		newDigits[0] = 1;

		for (int i = 1; i < newDigits.length; i++) {

			newDigits[i] = digits[i-1];
		}
		return newDigits;
	}
}
