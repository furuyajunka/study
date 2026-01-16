package curriculum.k;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculatePay() {
        return hours * 1000;
    }
}