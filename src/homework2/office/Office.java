package homework2.office;

import homework2.office.workers.Boss;
import homework2.office.workers.Manager;
import homework2.office.workers.Secretary;
import homework2.office.workers.SecurityGuard;

public class Office {
    public void workDay(Boss boss, Manager manager, SecurityGuard securityGuard, Secretary secretary) {
        boss.pushTheManager(manager.getName());
        manager.managerScreams();
        securityGuard.askForAdvance();
        secretary.calmsDown(boss.getName(), manager.getName(), securityGuard.getName());
    }
}
