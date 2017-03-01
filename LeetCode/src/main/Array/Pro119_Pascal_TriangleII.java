package main.Array;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro119_Pascal_TriangleII {
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return list;
		}
		
		if (rowIndex >= 0) {
			list.add(1);
		}else {
		    return list;
		}
		
		if (rowIndex >= 1) {
			list.add(1);
		}else{
		    return list;
		}
		
		for (int i = 1; i < rowIndex; i++) {
		    int lastNum = 1;
			for (int j = 1; j <= i; j++) {
			   
			    int newNum = lastNum + list.get(j);
			     lastNum = list.get(j);
				list.set(j, newNum);
			}
			list.add(1);
		}
		return list;
		
	}
}
