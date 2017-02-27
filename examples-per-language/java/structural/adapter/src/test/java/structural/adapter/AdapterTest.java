package structural.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {
    @Test
    public void testAdapter() {
        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();
        String roar = hunter.hunt(wildDogAdapter);

        assertEquals("WildDog's bark", roar);
    }
}