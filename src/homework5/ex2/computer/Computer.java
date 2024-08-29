package homework5.ex2.computer;

public class Computer {
    protected User user;

    public void userLogin(String name) {
        user = new User(name);
    }

    public void userExit() {
        user.setName(null);
    }

    public void sendMessage(String message) {
        System.out.printf("Сообщение: %s\n", message);
    }

    public User getUser() {
        return user;
    }
}
