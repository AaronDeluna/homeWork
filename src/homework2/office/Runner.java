package homework2.office;

import homework2.office.workers.Boss;
import homework2.office.workers.Manager;
import homework2.office.workers.Secretary;
import homework2.office.workers.SecurityGuard;

public class Runner {
    public static void main(String[] args) {
        Boss bos = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        SecurityGuard securityGuard = new SecurityGuard("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();

        office.workDay(bos, manager, securityGuard, secretary);
    }
}
