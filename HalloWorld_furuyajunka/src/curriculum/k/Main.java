package curriculum.k;

public class Main {

    public static void main(String[] args) {

        Payable emp1 = new FullTimeEmployee("山田", 8);
        Payable emp2 = new ContractEmployee("佐藤", 8);

        SalaryCalculator calculator = new SalaryCalculator();
        SalaryReporter reporter = new SalaryReporter();

        reporter.report(emp1, calculator);
        reporter.report(emp2, calculator);
    }
}
