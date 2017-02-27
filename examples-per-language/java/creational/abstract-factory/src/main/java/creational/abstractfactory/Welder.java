package creational.abstractfactory;

public class Welder implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit iron doors";
    }
}
