package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro167_Two_SumII {
	public int[] twoSum(int[] numbers, int target) {
		int indexs[] = {1,2};
	       if(numbers.length == 2){
				return indexs;
			}
			
			int halfTarget = target / 2;
			int halfLength = numbers.length/2;
			int breakPoint = 0;
			for (int i = 0; i < numbers.length-1; i++) {
				if (numbers[i] == halfTarget) {
					breakPoint = i;
					break;
				}
				
				if ((numbers[i] < halfTarget) && (numbers[i+1] > halfTarget)) {
					breakPoint = i;
					break;
				}
			}
			
			if (breakPoint < halfLength) {
				for (int i = breakPoint; i >= 0; i--) {
					indexs[0] = i+1;
					for (int j = breakPoint+1; j < numbers.length; j++) {
						if (numbers[j] == target-numbers[i]) {
							indexs[1] = j+1;
							return indexs;
						}
						if (numbers[j] > target-numbers[i]) {
							break;
						}
					}
				}
			}else {
				for (int i = breakPoint+1; i < numbers.length; i++) {
					indexs[1] = i+1;
					for (int j = breakPoint; j >= 0; j--) {
						if (numbers[j] == target-numbers[i]) {
							indexs[0] = j+1;
							return indexs;
						}
						if (numbers[j] < target-numbers[i]) {
							break;
						}
					}
				}
			}
			
			return indexs;
	}
}

//也可以考虑从两边向中间来
