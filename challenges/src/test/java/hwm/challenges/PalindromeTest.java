package hwm.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test0() {
		assertEquals(2, Palindrome.answer(0));
	}

	@Test
	public void test1() {
		assertEquals(2, Palindrome.answer(1));
	}

	@Test
	public void test2() {
		assertEquals(2, Palindrome.answer(2));
	}

	@Test
	public void test3() {
		assertEquals(2, Palindrome.answer(3));
	}

	@Test
	public void test4() {
		assertEquals(3, Palindrome.answer(4));
	}

	@Test
	public void test5() {
		assertEquals(2, Palindrome.answer(5));
	}

	@Test
	public void test6() {
		assertEquals(5, Palindrome.answer(6));
	}

	@Test
	public void test7() {
		assertEquals(2, Palindrome.answer(7));
	}

	@Test
	public void test41() {
		assertEquals(5, Palindrome.answer(41));
	}

	@Test
	public void test42() {
		assertEquals(4, Palindrome.answer(42));
	}

	@Test
	public void test43() {
		assertEquals(6, Palindrome.answer(43));
	}

	@Test
	public void test44() {
		assertEquals(10, Palindrome.answer(44));
	}

	@Test
	public void test45() {
		assertEquals(2, Palindrome.answer(45));
	}

	@Test
	public void test46() {
		assertEquals(4, Palindrome.answer(46));
	}

}
