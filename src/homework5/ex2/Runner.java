package homework5.ex2;

import homework5.ex2.computer.Computer;
import homework5.ex2.computer.ComputerSpy;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.userLogin("Anton");
        computerSpy.sendMessage("Hello Dima");
        computerSpy.userExit();
    }
}