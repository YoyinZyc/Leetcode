package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月20日 下午12:34:32
 * 
 */
public class Pro204_Count_Primes {
	
	public int countPrimes(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		if (n<3) return 0;

		primes.add(2);
		
		int num = 3;
		while(num < n){
			boolean isPrime = true;
			for (int i = 0; i < primes.size(); i++) {
				if (primes.get(i) > Math.sqrt(num)) break;

				if (num%primes.get(i) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(num);
			}
			num++;
		}
		
		return primes.size();
	}
}
