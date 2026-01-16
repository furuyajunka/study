package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> billables = new ArrayList<>();

        billables.add(new FullTimeEmployee("E005", "正社員"));
        billables.add(new ContractEmployee("E006", "契約社員"));

        for (Billable b : billables) {
            System.out.println("日給: " + b.costForDay(9));
        }
    }
}
