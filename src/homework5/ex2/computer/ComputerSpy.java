package homework5.ex2.computer;

import java.io.*;

public class ComputerSpy extends Computer {
    private Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void userLogin(String name) {
        try {
            writeToFile("Пользователь: " + name + " вошел");
            super.userLogin(name);
        } catch (IOException e) {
            System.out.println("Ошибка при входе пользователя: " + e.getMessage());
        }
    }

    @Override
    public void userExit() {
        try {
            writeToFile("Пользователь вышел");
            super.userExit();
        } catch (IOException e) {
            System.out.println("Ошибка при выходе пользователя: " + e.getMessage());
        }
    }

    @Override
    public void sendMessage(String message) {
        try {
            writeToFile("Пользователь: " + user.getName() + " отправил сообщение: " + message);
            super.sendMessage(message);
        } catch (IOException e) {
            System.out.println("Ошибка при отправке сообщения: " + e.getMessage());
        }
    }

    public void writeToFile(String message) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("comp.log", true))) {
            writer.write(message);
            writer.newLine();
        }
    }
}
