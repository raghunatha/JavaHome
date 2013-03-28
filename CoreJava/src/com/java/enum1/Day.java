package com.java.enum1;

public enum Day {
SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

private int dayOfWeek;

private Day(int dayOfWeek) {
	this.dayOfWeek = dayOfWeek;
}

public int getDayOfWeek() {
	return dayOfWeek;
}

public void setDayOfWeek(int dayOfWeek) {
	this.dayOfWeek = dayOfWeek;
}


}
