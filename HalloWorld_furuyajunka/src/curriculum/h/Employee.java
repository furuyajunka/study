package curriculum.h;

public abstract class Employee {
	protected String employeeId;
	protected String name;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public abstract int calculateDailyWage(int hoursWorked);
}
