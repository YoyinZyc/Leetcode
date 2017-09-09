package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro621_Task_Scheduler;

/**
 * @author Cactus
 * @category TopLiked-Medium & Greedy
 * @version Create at: Sep 9, 2017 4:47:09 PM
 */
public class Pro621_Task_SchedulerTest {
	Pro621_Task_Scheduler test = new Pro621_Task_Scheduler();
	@Test
	public void test() {
		char[] tasks = {'A','A','A','B','B','B'};
		test.leastInterval(tasks, 2);
	}

}
