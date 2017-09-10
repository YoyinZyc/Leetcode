package main;

/**
 * @author Cactus
 * @category TwoPoint_Easy
 * @version Create at: Sep 9, 2017 6:19:22 PM
 */
public class Pro344_Reverse_String {
	public String reverseString(String s) {
		char[] cs = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			char temp = cs[i];
			cs[i] = cs[j];
			cs[j] = temp;
			i++;
			j--;
		}
		return new String(cs);
	}
}
