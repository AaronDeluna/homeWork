package homework2.office.workers;

public class SecurityGuard {
    private String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askForAdvance() {
        System.out.println("Дайте мне аванс");
    }
}
