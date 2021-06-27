package com.DayWeek.program;

public class DayWeek {
	public static void main(String[] args){
		System.out.println("enter the date,month,year");
		Utility utility = new Utility ();
		int d = utility.getIntValue();
		int m = utility.getIntValue();
		int y = utility.getIntValue();
		utility.dayofWeek(y, m, d);
	}

}
