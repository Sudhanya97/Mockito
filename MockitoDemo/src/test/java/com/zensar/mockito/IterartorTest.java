package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;

public class IterartorTest {

	@Test
	public void testMoreThanOneReturnValue() {
		
		Iterator<String> it = Mockito.mock(Iterator.class);
		Mockito.when(it.next()).thenReturn("Rose").thenReturn("Lotus");
		
		String result = it.next()+" "+it.next();
		assertEquals("Rose Lotus", result);
	}
}
