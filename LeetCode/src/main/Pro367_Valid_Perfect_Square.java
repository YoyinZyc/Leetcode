package main;

import javax.xml.stream.events.StartDocument;

/**
 * @author Cactus
 * @category BS_Easy
 * @version Create at: Sep 5, 2017 12:13:00 AM
 */
public class Pro367_Valid_Perfect_Square {
	public boolean isPerfectSquare(int num) {
		if(num == 1) return true;
		if(num > 1 && num < 4) return false;
		if(num == 4) return true;
		int start = 2;
		int end = (num+1)/2;
		while(end-start > 1) {
			int index = (end-start)/2;
			if((long)((end-index) * (end-index)) == num) return true;
			if ((long)((end-index) * (end-index)) > num) {
				end = end-index;
			}else {
				start = end-index;
			}
		}
		return false;
		
	}
}
