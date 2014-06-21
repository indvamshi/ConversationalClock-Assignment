package com.visa.assignment;

import java.util.HashMap;
import java.util.Map;

public class TimeConstants {

	private static Map<Integer, String> HOUR_TEXTUAL_DICTIONARY = new HashMap<Integer, String>();
	private static Map<Integer, String> MINUTE_TEXTUAL_DICTIONARY = new HashMap<Integer, String>();
	
	public static final String MIDNIGHT = "Midnight";
	public static final String MIDDAY = "Midday";
	public static final String OCLOCK = "O'Clock";
	public static final String PAST = "past";
	public static final String TO = "to";
	
	static {
		HOUR_TEXTUAL_DICTIONARY.put(11, "Eleven");
		HOUR_TEXTUAL_DICTIONARY.put(12, "Twelve");
		HOUR_TEXTUAL_DICTIONARY.put(0, "Midnight");
		
		MINUTE_TEXTUAL_DICTIONARY.put(5, "Five");
		MINUTE_TEXTUAL_DICTIONARY.put(15, "A Quarter");
	}
	
	public static String textForHour(int hour) {
		if (hour == 12) {
			return HOUR_TEXTUAL_DICTIONARY.get(hour); 
		} else {
			return HOUR_TEXTUAL_DICTIONARY.get(hour % 12);
		}
	}
	
	public static String textForMinute(int minute) {
		return MINUTE_TEXTUAL_DICTIONARY.get(minute);
	}
}
