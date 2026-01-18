package curriculum.h;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee full = new FullTimeEmployee("E010","正社員");
        PartTimeEmployee part = new PartTimeEmployee("E011","派遣社員");
		
		System.out.println("正社員給与: " + full.calculateDailyWage(9));
        System.out.println("アルバイト給与: " + part.calculateDailyWage(9));
	}
}
