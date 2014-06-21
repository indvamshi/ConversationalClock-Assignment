package com.visa.assignment;

import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;

import java.util.Calendar;

public class Time {

	private static final int SIXTY_MINUTES = 60;
	private static final int TWENTY_FOUR_HOURS = 24;
	
	private Calendar cal;

	public static Time create(String timeString) {
		String[] timeParts = timeString.split(":");
		return new Time(Integer.valueOf(timeParts[0]), Integer.valueOf(timeParts[1]));
	}
	
	public Time(int hours, int minutes) {
		cal = Calendar.getInstance();
		cal.set(HOUR_OF_DAY, hours);
		cal.set(MINUTE, minutes);
	}

	public int getHour() {
		return cal.get(HOUR_OF_DAY);
	}
	
	public int getMinute() {
		return cal.get(MINUTE);
	}

	public void addMinutes(int minutesToAdd) {
		int minutes_since_midnight = (getHour() * SIXTY_MINUTES) + getMinute() + minutesToAdd;
		cal.set(HOUR_OF_DAY, (minutes_since_midnight / SIXTY_MINUTES) % TWENTY_FOUR_HOURS);
		cal.set(MINUTE, minutes_since_midnight % SIXTY_MINUTES);
	}

	public void subtractMinutes(int minutesToSubtract) {
		addMinutes(-1 * minutesToSubtract); 
	}

}
