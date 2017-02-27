package structural.facade;

public class App {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());
        computer.turnOn();
        computer.turnOff();
    }
}
