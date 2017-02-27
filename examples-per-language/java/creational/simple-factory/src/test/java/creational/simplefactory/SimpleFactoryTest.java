package creational.simplefactory;


import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleFactoryTest {
    @Test
    public void makeDoor () {
        Door door = DoorFactory.makeDoor(100, 200);
        assertEquals(100f, door.getWidth(), 0.0f);
        assertEquals(200f, door.getHeight(), 0.0f);
    }
}