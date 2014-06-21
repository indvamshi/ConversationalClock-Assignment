package com.visa.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testMidnight() {
		TestUtils.assertTime(00, 00, Time.create("00:00"));
	}
	
	@Test
	public void testMidNightPastFive() throws Exception {
		TestUtils.assertTime(00, 05, Time.create("00:05"));
	}
	
	@Test
	public void testMidNightPastOne() throws Exception {
		TestUtils.assertTime(00, 01, Time.create("00:01"));
	}
	
	@Test
	public void testQuarterToMidnight() throws Exception {
		TestUtils.assertTime(11, 45, Time.create("11:45"));
	}
	
	public static class TestUtils {
		public static void assertTime(int expectedHour, int expectedMinute, Time time) {
			assertEquals(expectedHour, time.getHour());
			assertEquals(expectedMinute, time.getMinute());
		}
		
		public static void assertConversationalTime(String expectedConversationalTime, TimeTextualiser timeTextualiser, Time time) {
			assertEquals(expectedConversationalTime, timeTextualiser.textualise(time));
		}
	}
	
}
