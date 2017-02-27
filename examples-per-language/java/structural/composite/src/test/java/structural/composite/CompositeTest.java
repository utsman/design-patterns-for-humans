package structural.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {
    @Test
    public void testComposite() {
        Employee john = new Developer("John Doe", 12000);
        Employee jane = new Designer("Jane", 10000);

        Organization organization = new Organization();
        organization.addEmployee(john);
        organization.addEmployee(jane);

        assertEquals(22000f, organization.getNetSalaries(), 0f);
    }
}