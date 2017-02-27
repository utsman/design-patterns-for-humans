package creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {
    @Test
    public void testWoodenDoorFactory() {
        DoorFactory factory = new WoodenDoorFactory();
        Door door = factory.makeDoor();
        DoorFittingExpert expert = factory.makeFittingExpert();

        assertEquals("I am a wooden door", door.getDescription());
        assertEquals("I can only fit wooden doors", expert.getDescription());
    }

    @Test
    public void testIronDoorFactory() {
        DoorFactory factory = new IronDoorFactory();
        Door door = factory.makeDoor();
        DoorFittingExpert expert = factory.makeFittingExpert();

        assertEquals("I am an iron door", door.getDescription());
        assertEquals("I can only fit iron doors", expert.getDescription());
    }

}