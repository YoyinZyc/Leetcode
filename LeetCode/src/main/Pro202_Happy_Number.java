package main;

import java.util.HashSet;
import java.util.List;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月20日 上午11:49:49
 * 
 */
public class Pro202_Happy_Number {

	public boolean isHappy(int n) {
		HashSet<Integer> nums = new HashSet<Integer>();
		int firstNum = n;
		while(true){
			
			if(!nums.add(n)) return false;
			char[] digits = String.valueOf(n).toCharArray();
			n = 0;
			for (int i = 0; i < digits.length; i++) {
				n += (int) Math.pow(digits[i] - '0', 2);
			}
			if (n == 1)  return true;
//			if (n == firstNum) return true;
		}
	}
}
