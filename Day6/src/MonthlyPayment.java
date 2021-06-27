package com.DayWeek.program;
import com.DayWeek.program.Utility;
public class MonthlyPayment {
	public static void main(String[] args ) {
		System.out.println("enter the principal , rate , year");
		
		Utility utility = new Utility();
		System.out.println("enter the principal amount");
		Double p = utility.getDoubleValue();
		System.out.println("enter the year");
		Double y= utility.getDoubleValue();
		System.out.println("enter the rate");
		Double r= utility.getDoubleValue();
		utility.monthlyPayment(p , y , r );
		
	}

}
