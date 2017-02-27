package structural.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        Coffee someCoffee = new SimpleCoffee();
        assertEquals(10f, someCoffee.getCost(), 0f);
        assertEquals("Simple Coffee", someCoffee.getDescription());

        someCoffee = new MilkCoffee(someCoffee);
        assertEquals(12f, someCoffee.getCost(), 0f);
        assertEquals("Simple Coffee, milk", someCoffee.getDescription());

        someCoffee = new WhipCoffee(someCoffee);
        assertEquals(17f, someCoffee.getCost(), 0f);
        assertEquals("Simple Coffee, milk, whip", someCoffee.getDescription());

        someCoffee = new VanillaCoffee(someCoffee);
        assertEquals(20f, someCoffee.getCost(), 0f);
        assertEquals("Simple Coffee, milk, whip, vanilla", someCoffee.getDescription());
    }
}