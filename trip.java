import java.util.ArrayList;
import java.util.List;

public class trip {
    private String name;
    private List<passenger> passengers;
    private List<place> destinations;
    private int capacity;

    public trip(String name, int capacity, List<place> destinations){
        this.name = name;
        this.passengers = new ArrayList<passenger>();
        this.destinations = destinations;
        this.capacity = capacity;
    }

    public boolean addPassengger(passenger tripPassenger){
        if(capacity == passengers.size()) return false;
        passengers.add(tripPassenger);
        return true;
    }

    public void passengerList(){
        System.out.println("Trip Package name: " + name);
        System.out.println("Trip Package capacity: " + capacity);
        System.out.println("Passengers Information: ");
        for(int i=0;i<passengers.size();i++){
            System.out.print((i+1) + ". ");
            passengers.get(i).getInformation();
        }
    }

    public void packageDetails(){
        System.out.println("Trip Package name: " + name);
        System.out.println("Trip Package capacity: " + capacity);
        System.out.println("Destinations: ");
        for(int i=0;i<destinations.size();i++){
            System.out.println((i+1) + ". " + destinations.get(i).getName());
            destinations.get(i).printAllActivities();
        }
    }
}
