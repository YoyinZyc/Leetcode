package main;
/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年3月31日 下午6:16:32
 * 
 */
public class Pro299_Bulls_And_Cows {
	public String getHint(String secret, String guess) {
		int countA = 0;
		int countB = 0;

		int[] secretDigits = new int[10];
		int[] guessDigits = new int[10];

		int i = 0;
		while(i < secret.length()) {
			if (secret.charAt(i) == guess.charAt(i)) {
				countA++;
				i++;
				continue;
			}
			if ((secretDigits[guess.charAt(i)-'0'] > 0)) {
				countB++;
				secretDigits[guess.charAt(i)-'0']--;
			}else{
				guessDigits[guess.charAt(i)-'0']++;
			}
			if (guessDigits[secret.charAt(i)-'0'] > 0) {
				countB++;
				guessDigits[secret.charAt(i)-'0']--;
			}else{
				secretDigits[secret.charAt(i)-'0']++;
			}
			i++;
		}
		return countA+"A"+countB+"B";
	}
}
