
import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int number,y=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		number = sc.nextInt();
		
		while(number != 0) {
			r = number % 10;
			y = y*10+r;
			number = number / 10;
			}
		System.out.println("reverse number is " + y);
		
		
	}

}