package Primjeri;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedPairTest {

	@Test
	public void shourRetainOrderOfOrderedPair() {
		SortedPair<String> pair = new SortedPair<>("ab", "cd");
		assertEquals("ab", pair.getFirst().toString());
		assertEquals("cd", pair.getSecond().toString());
	}

	@Test
	public void shouldFlipOrderOfMisOrderedPair() {
		SortedPair<Integer> pair = new SortedPair<>(2, 1);
		assertEquals(1, pair.getFirst().intValue());
		assertEquals(2, pair.getSecond().intValue());
	}
}
