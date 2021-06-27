
package vending;

import java.util.Scanner;

public class VendingMachine {
	
	static int i=0 , total = 0 ;
	public static int  getRupeeNotesCount( int amount ,int[] notes) {
	     int remainder = 0;
		if (amount == 0) {
			
			 return 0;
		 }
	   else {
			if(amount  >= notes[i]) {		
				int CalculateNotes = amount / notes[i] ;
				remainder = amount % notes[i];
				amount = remainder;
				total += CalculateNotes;
				System.out.println(notes[i] + ".Rs notes" +CalculateNotes);
			}
			
			}
	    	i++;
	    	
	    	return getRupeeNotesCount(amount , notes);
			
}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		int[] notes = {1000,500,100,50,10,5,2,1};
		getRupeeNotesCount( amount , notes);
	}

}

