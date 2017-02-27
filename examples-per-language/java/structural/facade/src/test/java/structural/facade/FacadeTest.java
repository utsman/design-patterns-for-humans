package structural.facade;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class FacadeTest {
    @Test
    public void testFacade() {
        Computer computer = spy(new Computer());

        ComputerFacade computerFacade = new ComputerFacade(computer);
        computerFacade.turnOn();

        verify(computer, times(1)).getElectricShock();
        verify(computer, times(1)).makeSound();
        verify(computer, times(1)).showLoadingScreen();
        verify(computer, times(1)).bam();
        verify(computer, times(0)).closeEverything();
        verify(computer, times(0)).pullCurrent();
        verify(computer, times(0)).sooth();

        computerFacade.turnOff();

        verify(computer, times(1)).closeEverything();
        verify(computer, times(1)).pullCurrent();
        verify(computer, times(1)).sooth();

    }
}