import java.util.ArrayList;

public class BusStop {
    private ArrayList<Passenger> queue;
    private String name;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int passengerCount(){
        return queue.size();
    }

    public void addPassenger(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePassenger(){
       return this.queue.remove(0);
    }
}
