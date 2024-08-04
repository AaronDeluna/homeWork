package homework2.office.workers;

public class Bos {
    private String name;

    public Bos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushTheManager(String name) {
        System.out.printf("%s быстрее!\n", name);
    }
}
