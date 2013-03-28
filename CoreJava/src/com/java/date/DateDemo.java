package com.java.date;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDay());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar);
		Date date1 = calendar.getTime();
		System.out.println(date1);
		
		
		
		

	}

}
