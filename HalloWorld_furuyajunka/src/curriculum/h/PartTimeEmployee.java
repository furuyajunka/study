package curriculum.h;

public class PartTimeEmployee extends Employee{
	private static final int HOURLY_PART = 1000;
	
	public PartTimeEmployee() {
		super();
	}
	
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_PART;
	}
}
