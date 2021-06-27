
import java.util.Scanner;
public class Stopwatch {
	
	Scanner sc = new Scanner(System.in);
	public long StartTimer;
	public long StopTimer;
	public long elapsed;
	int Clkstart;
	int Clkend;
	
	public void Start() {
		System.out.println(" enter the number 1 to start");
		Clkstart  = sc.nextInt();
		if (Clkstart == 1) {
			StartTimer = System.currentTimeMillis();
			
		}
		else {
			System.out.println("enter the valid input to Start");
		}
	}
	
	public void stop() {
	  if(Clkstart == 1) {
		System.out.println("enter the number 0 to stop ");
		Clkend = sc.nextInt();
		if (Clkend == 0) {
			StopTimer = System.currentTimeMillis();
			}
		else {
			System.out.println("enter the valid input to stop");
		}
	}
	}
	public void elapsedTime() {
		if(Clkend == 0)
		{
			elapsed = StartTimer - StopTimer;
			System.out.println("Elapsed time is :" + elapsed/1000 + "seconds");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.Start();
		stopwatch.stop();
		stopwatch.elapsedTime();
		
		

		
	}
}