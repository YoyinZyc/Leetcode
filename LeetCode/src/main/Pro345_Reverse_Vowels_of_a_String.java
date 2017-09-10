package main;

/**
 * @author Cactus
 * @category TwoPoints_Easy
 * @version Create at: Sep 9, 2017 7:10:43 PM
 */
public class Pro345_Reverse_Vowels_of_a_String {
	public String reverseVowels(String s) {
		if (s.length() <= 1) {
			return s;
		}
		char[] cs = s.toCharArray();
		int i = 0;
		int j = cs.length-1;
		while(i < j) {
			while(i < j && !isVowel(cs[i])) i++;
			while(j > i && !isVowel(cs[j])) j--;
			if(i < j) {
				char temp = cs[i];
				cs[i] = cs[j];
				cs[j] = temp;
				i++;
				j--;
			}else {
				break;
			}
		}
		return new String(cs);
	}
	private boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c=='o' || c == 'u' 
				|| c == 'A' || c == 'E' || c == 'I' || c=='O' || c == 'U' ) return true;
		return false;
	}
}
