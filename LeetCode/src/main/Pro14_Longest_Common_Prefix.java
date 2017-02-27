package main;
/*
 * Another clear way:
 * Sort the array first, then just need to compare the first and the last str
 * however, it has no help to the complexity because of the cost of array-sorting
 */
public class Pro14_Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		
		if (strs.length == 1) {
			return strs[0];
		}
		
		String longestPreString = strs[0];
		for (int i = 1; i < strs.length; i++) {
			longestPreString = findCommonPrefix(longestPreString, strs[i]);
		}
		
		
		return longestPreString;
    }
	
	private String findCommonPrefix(String str1, String str2){
		
		
		
		int length = str1.length() > str2.length()? str2.length() : str1.length();
		if (length == 0) {
			return "";
		}
		
		int index = 0;
		while ((index < length) && (str1.charAt(index) == str2.charAt(index))){
			index++;
		}
		return str1.substring(0,index);
		
	}
}
