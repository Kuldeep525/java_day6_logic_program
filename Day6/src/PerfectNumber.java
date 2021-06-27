package com.perfectNumber;
import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		 int number , sum = 0 ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number ");
		 number = sc.nextInt();
		 
		 for (int i=1; i < number;i++) {
			 
			 if(number % i == 0) {
				 System.out.println(i);
				 sum = sum + i;
			 }
		 }
		 if(sum == number) {
			 System.out.println("your number is an perfect number " + sum);
		 }
		 else {
			 System.out.println("your number is not an perfect number "  + sum);
		 }
		 
	}

}
