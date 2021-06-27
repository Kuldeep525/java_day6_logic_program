package com.DayWeek.program;
import java.util.Scanner;
import java.lang.Math;

public class Utility {
	
	Scanner sc;
	
	public Utility() {
		sc	 = new Scanner(System.in);
	}
	public int getIntValue() {
		return sc.nextInt();		
	}
	public Double getDoubleValue() {
		return sc.nextDouble();		
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
	
	public static void temperatureConversion( Double n ) {
	
		     Double    f =   (n * 9 / 5) + 32 ;
	         Double   c =    (n - 32) * 5 / 9 ;
	         System.out.println("celsius is " +f);
	         System.out.println("fahrenhiet is " +c);
	}
        
	public static void monthlyPayment(Double y , Double r ,Double p) {
		
		 Double rate = r / ( 12 * 100);  
         Double n = 12 * y;          

        Double payment  = (p * rate) / (1 - Math.pow(1 + rate , -n));
        Double interest = payment * n - p;
        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
		
	}
	
	public static void sqrt(Double c) {
		
		Double epsilon = 1.0e-15;
		Double t = c;
		
		while(Math.abs(t -c/t) > epsilon*t) {
			t = (c/t + t)/ 2.0;
			
		}
		System.out.println("square root is" +t);
		
	}

}
