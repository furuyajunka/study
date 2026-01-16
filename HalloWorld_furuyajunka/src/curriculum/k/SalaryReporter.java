package curriculum.k;

public class SalaryReporter {

    public void report(Payable p, SalaryCalculator calculator) {
        int salary = calculator.calculate(p);
        System.out.println(p.getName() + "さんの給料は" + salary + "円です。");
    }
}
