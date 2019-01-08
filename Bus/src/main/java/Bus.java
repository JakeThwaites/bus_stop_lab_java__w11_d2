import java.util.ArrayList;

public class Bus {
    private ArrayList<Passenger> passengers;
    private Integer capacity;
    private String destination;

    public Bus(String destination, Integer capacity ){
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int passengersCount(){
        return passengers.size();
    }


    public void addPassenger(Passenger passenger) {
        if ( checkIfCapacity() ){
            passengers.add(passenger);
        }
    }

    public boolean checkIfCapacity(){
        return passengers.size() < capacity;
    }

    public void removePassenger(Passenger passenger){
        if (passengers.size() > 1){
            passengers.remove(passenger);
        }
    }

    public void pickUp(BusStop busStop){
        if ( checkIfCapacity() ) {
            Passenger thatPassenger = busStop.removePassenger();
            this.addPassenger(thatPassenger);
        }
    }


}
