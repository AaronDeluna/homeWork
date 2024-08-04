package homework2.office.workers;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void managerScreams() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
