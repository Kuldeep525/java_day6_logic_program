package com.primenumber.program;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 int number ,temp ;
		 boolean isprime = true;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number ");
		 number = sc.nextInt();
		
		 for (int i=2; i <= number / 2 ; i++) 
		 {
			 temp=number%i;
			 if(temp == 0)
			 {
				 isprime = false;
				 break;
			 }
		 }
			 if(isprime) {
				 System.out.println(" This is a prime number" + number);
			 }
			 else {
				 System.out.println("this is not a prime number" + number);
			 }
	}

	}


