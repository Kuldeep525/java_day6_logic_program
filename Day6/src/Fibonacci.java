package com.fibonacci;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args) {
		
		int number ,sum;
		int a = -1 ,b = 1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
		
		for (int i=0; i<=number;i++) {
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		
		
		
	}

}
