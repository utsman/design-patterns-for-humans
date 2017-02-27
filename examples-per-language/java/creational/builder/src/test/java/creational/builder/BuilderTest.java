package creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {
    @Test
    public void testBuild() throws Exception {
        Burger burger = new Burger.BurgerBuilder(14)
                .addPepperoni()
                .addLettuce()
                .addTomato()
                .build();

        assertEquals(14, burger.getSize());
        assertTrue(burger.isPepperoni());
        assertTrue(burger.isLettuce());
        assertTrue(burger.isTomato());
        assertFalse(burger.isCheese());
    }
}