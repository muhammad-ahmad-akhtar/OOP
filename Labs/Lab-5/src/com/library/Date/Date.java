package com.library.Date;

public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	public void showDate() {
		System.out.printf("%02d/%02d/%02d%n", this.day, this.month, this.year);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Date)) { 
			return false; 
		}

		Date other = (Date) obj;

		return this.day == other.day && this.month == other.month && this.year == other.year;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
}