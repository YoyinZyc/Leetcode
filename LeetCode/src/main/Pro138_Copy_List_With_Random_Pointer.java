package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月11日 下午5:41:30
 * 
 */
public class Pro138_Copy_List_With_Random_Pointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) return null;
		int count = 0;
		HashMap<RandomListNode, Integer> oldMap = new HashMap<RandomListNode, Integer>();
		HashMap<Integer, RandomListNode> newMap = new HashMap<Integer, RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.label);
		while (head != null) {
			
			oldMap.put(head, count);
			if (head.next != null) {
				RandomListNode newNext = new RandomListNode(head.next.label);
				newHead.next = newNext;
				newMap.put(count, newHead);
				newHead = newHead.next;
				count++;
				head = head.next;
			}else {
				newMap.put(count, newHead);
				break;
			}
		}
		for (Iterator<Entry<RandomListNode, Integer>> iterator = oldMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<RandomListNode, Integer> entry = iterator.next();
			if (entry.getKey().random != null) newMap.get(entry.getValue()).random = newMap.get(oldMap.get(entry.getKey().random));
		}
		return newMap.get(0);
	}
}
