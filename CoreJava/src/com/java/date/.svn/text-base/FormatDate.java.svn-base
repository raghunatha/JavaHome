package com.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		calendar.roll(Calendar.DAY_OF_MONTH, 10);
		Date date = calendar.getTime();
		
		SimpleDateFormat format = new SimpleDateFormat("MM.dd.yyyy hh 'o''clock' a, zzzz");
		String formatteddate = format.format(date);
		
		System.out.println(formatteddate);

	}

}
