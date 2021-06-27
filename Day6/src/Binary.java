package com.DayWeek.program;
import java.util.Scanner;

public class Binary {
	
	public static void inttoBinary(int num) {
		System.out.println(Integer.toBinaryString(num));
	}
	public static void swapNibbles(int x)
	{
	   int number =   ( (x & 0x0F) << 4 | (x & 0xF0) >> 4 );
	 	System.out.println(number);
	 	if ( number % 2 == 0){
	 		number = number/2;
	 	}
	 	if (number == 1) {
	 	    System.out.println("this number is power of 2");
	 	    
	 	}
	 	else {
	 		System.out.println("not a power of 2");
	 	}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer");
		int num = sc.nextInt();
		inttoBinary(num);
		System.out.println("enter the integer to swipe");
		int x = sc.nextInt();
		swapNibbles(x);
		
	
		
	}
}
