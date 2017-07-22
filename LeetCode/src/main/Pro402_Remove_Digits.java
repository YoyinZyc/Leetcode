package main;
/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月21日 下午5:13:31
 * 
 */
public class Pro402_Remove_Digits {
	public String removeKdigits(String num, int k) {
		if(num.length() <= k) return "0";
		if(k == 0) return num;
		String ret= "";
		int len = num.length() - k;
		while(k > 0) {
			if(num.length() == k) {
				num = "";
				break;
			}
			int index = pickDigit(num, k);
			// if(num.charAt(index) != '0')
			ret += num.charAt(index);
			System.out.println(ret);
			num = num.substring(index+1);
			k = k-index;
		}
		ret += num;
		int i = 0;
		System.out.println(ret);
		while((i < ret.length()) && (ret.charAt(i) == '0')) {
			i++;
		}
		if(i == ret.length()) return "0";
		return ret.substring(i);

	}

	private int pickDigit(String num, int k) {
		int length = num.length();
		int minIndex = 0;
		int min = num.charAt(0);
		for (int i = 0; i < k+1; i++) {
			if (num.charAt(i) < min) {
				min = num.charAt(i);
				minIndex = i;
			}
		}
		return minIndex;
	}
}

