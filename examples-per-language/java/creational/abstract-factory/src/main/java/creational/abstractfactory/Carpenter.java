package creational.abstractfactory;

public class Carpenter implements DoorFittingExpert {
    @Override
    public String getDescription() {
        return "I can only fit wooden doors";
    }
}
