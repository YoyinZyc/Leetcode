package test.Array;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.Array.Pro119_Pascal_TriangleII;

import org.junit.Test;

public class Pro119_Pascal_TriangleIITest {
	
	
	Pro119_Pascal_TriangleII test = new Pro119_Pascal_TriangleII();
	
	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(1);
		assertEquals(list, test.getRow(3));
	}

}
