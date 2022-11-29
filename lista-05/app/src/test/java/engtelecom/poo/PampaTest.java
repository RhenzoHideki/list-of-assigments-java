package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PampaTest {
    @Test
    public void speedTest() {
        Pampa p = new Pampa();
        p.speedUp(250);
        assertEquals("Current speed is 140.0", p.getSpeed());

        p.brake(200);
        assertEquals("Current speed is 0.0", p.getSpeed());

    }

    @Test
    public void tractionTest() {
        Pampa p = new Pampa();
        p.speedUp(1);

        assertEquals("Vehicle must be parked", p.enableDisableTraction());

        p.brake(1);

        assertEquals("Integrated Traction is enabled", p.enableDisableTraction());
        assertEquals("Integrated Traction is disabled", p.enableDisableTraction());
        assertEquals("Integrated Traction is enabled", p.enableDisableTraction());

    }

    @Test
    public void truckBedTest() {
        Pampa p = new Pampa();
        p.speedUp(1);

        assertEquals("Vehicle must be parked", p.openCloseTruckBed());

        p.brake(1);

        assertEquals("Truck bed is open", p.openCloseTruckBed());
        assertEquals("Truck bed is closed", p.openCloseTruckBed());
        assertEquals("Truck bed is open", p.openCloseTruckBed());

    }
}
