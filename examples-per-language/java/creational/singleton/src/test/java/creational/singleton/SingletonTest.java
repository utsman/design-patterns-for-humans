package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class SingletonTest {
    @Test
    public void testSingleton () {
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        assertNotNull(president1);
        assertNotNull(president2);
        assertSame(president1, president2);
    }
}