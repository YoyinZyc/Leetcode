package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Easy
 * @version Create at: Sep 10, 2017 8:39:00 PM
 */
public class Pro401_Binary_Watch {
	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<String>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		helper(list, index, 0, num, 0, 0);
		return list;
	}

	private void helper(List<String> list, ArrayList<Integer> index, int count, int num, int countHour, int countMinute) {
		if(count == num) {
			String time = countHour +":";
			if(countMinute < 10) {
				time = time+"0"+countMinute;
			}else {
				time+=countMinute;
			}
			if(!list.contains(time))
				list.add(time);
			return;
		}
		int i = 0;
		while(i < 10) {
			if(!index.contains(i)) {
				if(i < 6) {
					if((countMinute + Math.pow(2, i)) > 59) {
						return;
					}else {
						ArrayList<Integer> clone = (ArrayList<Integer>) index.clone();
						clone.add(i);
						helper(list, clone, count+1, num, countHour, (int)(countMinute + Math.pow(2, i)));
					}
				}else {
					if((countHour + Math.pow(2, i-6)) > 11) {
						return;
					}else {
						ArrayList<Integer> clone = (ArrayList<Integer>) index.clone();
						clone.add(i);
						helper(list, clone, count+1, num,(int)(countHour + Math.pow(2, i-6)), countMinute);
					}
				}
			}
			i++;
		}
	}
}
