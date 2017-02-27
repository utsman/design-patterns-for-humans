package structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class BridgeTest {
    @Test
    public void testBridge() {
        Theme darkTheme = new DarkTheme();

        WebPage about = new About(darkTheme);
        WebPage careers = new Careers(darkTheme);

        assertEquals("About page in Dark Black", about.getContent());
        assertEquals("Careers page in Dark Black", careers.getContent());
    }
}