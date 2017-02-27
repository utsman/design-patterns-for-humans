package creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeTest {
    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Sheep original = new Sheep("Jolly", "Mountain Sheep");
        assertEquals("Jolly", original.getName());
        assertEquals("Mountain Sheep", original.getCategory());

        Sheep clone = (Sheep) original.clone();
        clone.setName("Dolly");
        assertEquals("Dolly", clone.getName());
        assertEquals("Mountain Sheep", clone.getCategory());
    }
}