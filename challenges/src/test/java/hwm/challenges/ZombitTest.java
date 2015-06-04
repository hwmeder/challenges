package hwm.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZombitTest {

	@Test
	public void test5() {
		assertEquals(5, Zombit.answer(new int[][] {{1, 3}, {3, 6}}));
	}

	@Test
	public void test4() {
		assertEquals(4, Zombit.answer(new int[][] {{1, 5}}));
	}

}
