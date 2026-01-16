package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E003", "正社員"));
        employees.add(new ContractEmployee("E004", "契約社員"));
        
        for (Employee e : employees) {
            int wage = e.calculateDailyWage(9);
            System.out.println("日給: " + wage);
        }
    }
}
