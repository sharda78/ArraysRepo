package com.arrayOfObjectAssignments;

public class MyDate
{
	int day,year;
	String month;

	
	public MyDate(int day, int year, String month) {
		this.day = day;
		this.year = year;
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}

	
	@Override
	public String toString() {
		return "MyDate : [day=" + day + ", year=" + year + ", month=" + month + "]";
	}


	

}
