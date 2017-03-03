package main.Array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Cactus
 * @category Array-medium
 * @version Create at: 2017年3月2日 下午3:17:47
 * Pro448
 */
public class RandomizedSet {
	/** Initialize your data structure here. */
	ArrayList<Integer> list = new ArrayList<Integer>();
	public RandomizedSet() {

	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
		if (list.contains(val)) {
			return false;
		}
		list.add(val);
		return true;
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {
		return list.remove((Object)val);
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random random = new Random();
		return list.get(random.nextInt(list.size()));
	}
}
