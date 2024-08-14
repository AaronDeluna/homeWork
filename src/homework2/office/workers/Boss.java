package homework2.office.workers;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushTheManager(String name) {
        System.out.printf("%s быстрее!\n", name);
    }
}
