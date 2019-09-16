package Primjeri;

import static org.junit.Assert.*;

import org.junit.Test;

public class circularBufferTest {
	
	private CircularBuffer buffer = new CircularBuffer(4);
	
	@Test
	public void shouldOfferPollableElement(){
		assertTrue(buffer.offer(1));
		assertEquals(1, buffer.poll());
		assertNull(buffer.poll());
	}

	@Test
	public void shouldNotOfferWhenBufferIsFull(){
		assertTrue(buffer.offer(1));
		assertTrue(buffer.offer(2));
		assertTrue(buffer.offer(3));
		assertTrue(buffer.offer(4));
		assertFalse(buffer.offer(5));
	}
	
	@Test
	public void shouldNotPollWhenBufferIsEmpty(){
		assertNull(buffer.poll());
	}
	
	@Test
	public void shouldRecycleBuffer(){
		assertTrue(buffer.offer(1));
		assertTrue(buffer.offer(2));
		assertTrue(buffer.offer(3));
		assertTrue(buffer.offer(4));
		assertEquals(1, buffer.poll());
		assertTrue(buffer.offer(5));
		assertEquals(2, buffer.poll());
		assertTrue(buffer.offer(6));
		assertEquals(3, buffer.poll());
		assertTrue(buffer.offer(7));
		assertEquals(4, buffer.poll());
		assertEquals(5, buffer.poll());
		assertEquals(6, buffer.poll());
		assertEquals(7, buffer.poll());
	}
}
