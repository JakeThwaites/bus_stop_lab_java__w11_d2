import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Bus bus;
    private BusStop busStop;
    private Passenger passenger;
    private Passenger passenger2;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 3);
        busStop = new BusStop("Edinburgh");
        passenger = new Passenger();
        passenger2 = new Passenger();
    }

    @Test
    public void busStopStartsWithZeroPassengers(){
        assertEquals(0, busStop.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        busStop.addPassenger(passenger);
        assertEquals(1, busStop.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPassenger(passenger);
        busStop.addPassenger(passenger);
        assertEquals(2, busStop.passengerCount());
        busStop.removePassenger();
        assertEquals(1, busStop.passengerCount());

    }
}
