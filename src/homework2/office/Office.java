package homework2.office;

import homework2.office.workers.Bos;
import homework2.office.workers.Manager;
import homework2.office.workers.Secretary;
import homework2.office.workers.SecurityGuard;

public class Office {
    public void workDay(Bos bos, Manager manager, SecurityGuard securityGuard, Secretary secretary) {
        bos.pushTheManager(manager.getName());
        manager.managerScreams();
        securityGuard.askForAdvance();
        secretary.calmsDown(bos.getName(), manager.getName(), securityGuard.getName());
    }
}
