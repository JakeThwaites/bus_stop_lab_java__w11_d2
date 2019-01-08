import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;
    Bus bus2;
    Passenger passenger2;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 40);
        passenger = new Passenger();
        bus2 = new Bus("Aberdeen", 1);
        passenger2 = new Passenger();
        busStop = new BusStop("Edinburgh");
    }

    @Test
    public void busStartsWith0Passengers(){
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void canAddPassengerIfThereIsCapacity(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    public void cannotAddPassengerIfNoCapacity(){
        bus2.addPassenger(passenger);
        assertEquals(1, bus2.passengersCount());
        bus2.addPassenger(passenger);
        assertEquals(1, bus2.passengersCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger2);
        assertEquals(2, bus.passengersCount());
        bus.removePassenger(passenger);
        assertEquals(1, bus.passengersCount());
    }

    @Test
    public void canAddPassengerFromBusStop(){
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.passengerCount());
        bus.pickUp(busStop);
        assertEquals(0, busStop.passengerCount());
        assertEquals(1, bus.passengersCount());
    }
}
