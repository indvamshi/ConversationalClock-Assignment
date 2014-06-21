package com.visa.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversationalClockTest {
 	
	private ConversationalClock conversationalClock;

	@Before
	public void setUp() {
		conversationalClock = new ConversationalClock();
	}
	
	@Test
	public void testForMidnight() throws Exception {
		Assert.assertEquals("Midnight", conversationalClock.tellTime("00:00"));
	}
	
	@Test
	public void testForFivepastMidnight() throws Exception {
		Assert.assertEquals("Five past Midnight", conversationalClock.tellTime("00:05"));
	}
	
	@Test
	public void testForMidnight01() throws Exception {
		Assert.assertEquals("Midnight", conversationalClock.tellTime("00:00"));
	}
	
	@Test
	public void testAQuarterToMidnight() throws Exception {
		Assert.assertEquals("A Quarter to Midnight", conversationalClock.tellTime("23:45"));
	}
	
}
