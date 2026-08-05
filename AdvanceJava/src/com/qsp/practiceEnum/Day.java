package com.qsp.practiceEnum;

public enum Day {
	SUNDAY(1, "START"), MONDAY(2, "OFFICE"), TUESDAY(3, "WORK PRESSURE"), WEDNESDAY(4, "NON VEG"), THURSDAY(5, "VEG"),
	FRIDAY(6, "JUMMA"), SATURDAY(7, "WEEK END");

	private Day(int dayno, String description) {
		this.dayno = dayno;
		this.description = description;
	}

	private int dayno;
	private String description;

	public String details() {
		return dayno + " " + description;
	}
}
