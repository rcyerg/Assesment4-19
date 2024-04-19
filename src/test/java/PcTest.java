import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PcTest {

    Resolution resolution = new Resolution(10, 20);
    Monitor monitor = new Monitor(resolution, "XF050", "acer");
    Dimension dimension = new Dimension(12, 12, 6);
    Case computerCase = new Case("T880-A", "Fractal", "EVGA", dimension);
    Motherboard motherboard =  new Motherboard("Z-ff28", "Aorus", 4, 3, "UEFI" );



    @Test
    public void pcMotherBoardConstructorTest(){


        //Given
        Motherboard expectedMotherboard = new Motherboard("Z-ff28", "Aorus", 4, 3, "UEFI" );


        PC pc = new PC(computerCase, expectedMotherboard, monitor);

        //When

        Motherboard actual = pc.getMotherboard();

        //Then

        assertEquals(expectedMotherboard, actual);

    }

    @Test
    public void pcCaseConstructorTest(){


        //Given

        Case expectedComputerCase = new Case("T880-A", "Fractal", "EVGA", dimension);

        PC pc = new PC(expectedComputerCase, motherboard, monitor);

        //When

        Case actual = pc.getComputerCase();

        //Then

        assertEquals(expectedComputerCase, actual);

    }

    @Test
    public void pcMonitorConstructorTest(){


        //Given

        Monitor expectedMonitor = new Monitor(resolution, "XF050", "acer");

        PC pc = new PC(computerCase, motherboard, expectedMonitor);

        //When

        Monitor actual = pc.getMonitor();

        //Then

        assertEquals(expectedMonitor, actual);

    }
}
