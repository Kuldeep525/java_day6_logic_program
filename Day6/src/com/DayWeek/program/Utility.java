package com.DayWeek.program;
import java.util.Scanner;

public class Utility {
	
	Scanner sc;
	
	public Utility() {
		sc	 = new Scanner(System.in);
	}
	public int getIntValue() {
		return sc.nextInt();		
	}
	
	public static  void dayofWeek( int y , int m , int  d) {
		
	int y0 = y - (14 - m) / 12 ;
	int	x = y0 + y0/4 - y0/100 + y0/400; 
	int	m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + 31*m0 / 12) % 7;

	if ( d0 == 0) 
       System.out.println("sunday");
	else if (d0 == 1)
		System.out.println("monday");
	else if (d0 == 2 )
		System.out.println("tuesday");
	
	
	}
	public void getcoupon() {
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer stringbuffer=new StringBuffer();

		while (random>0)
		{
			stringbuffer.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=stringbuffer.toString();
		System.out.println("Coupon Code: "+couponCode);	
		
		// TODO Auto-generated method stub
		
	}
	


}
