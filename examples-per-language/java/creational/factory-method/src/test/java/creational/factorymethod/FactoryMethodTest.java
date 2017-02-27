package creational.factorymethod;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryMethodTest {
    @Test
    public void takeInterview() {
        HiringManager developmentManager = new DevelopmentManager();
        assertEquals("Asking about design patterns!", developmentManager.takeInterview());

        HiringManager marketingManager = new MarketingManager();
        assertEquals("Asking about community building", marketingManager.takeInterview());
    }
}