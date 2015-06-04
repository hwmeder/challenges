package hwm.challenges;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;

public class GraphTest {

	@Test
	public void testc() {
		Collection<Character> expectation = new HashSet<Character>();
		expectation.add('c');
		assertEquals(expectation, Graph.getReachable('c'));
	}

	@Test
	public void testf() {
		Collection<Character> expectation = new HashSet<Character>();
		expectation.add('f');
		assertEquals(expectation, Graph.getReachable('f'));
	}

	@Test
	public void testb() {
		Collection<Character> expectation = new HashSet<Character>();
		expectation.add('b');
		expectation.add('c');
		expectation.add('d');
		expectation.add('e');
		assertEquals(expectation, Graph.getReachable('b'));
	}

	@Test
	public void testa() {
		Collection<Character> expectation = new HashSet<Character>();
		expectation.add('a');
		expectation.add('b');
		expectation.add('c');
		expectation.add('d');
		expectation.add('e');
		assertEquals(expectation, Graph.getReachable('a'));
	}

}
