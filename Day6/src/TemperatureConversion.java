import com.DayWeek.program.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("enter the temperature ");
		Utility utility = new Utility();
		Double n = utility.getDoubleValue();
		utility.temperatureConversion(n); 
		}
		
	}


