public class activity {
    private String name;
    private String description;
    private int cost;
    private int capacity;
    private int availableSpace;

    public activity(String name, String description, int cost, int capacity){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.availableSpace = this.capacity;
    }

    public boolean hasSpace(){
        return availableSpace!=0;
    }

    public boolean signActivity(passenger p){
        if(hasSpace()) return false;
        availableSpace--;
        if(p.membership == "standard" && p.balance>=cost){
            p.balance -= cost; return true;
        }
        else if(p.membership == "gold" && p.balance>=0.9 * cost){ 
            p.balance -= (0.9)*cost; return true;
        }
        else if(p.membership == "premium") return true;
        availableSpace++;
        return false;
    }

    public void details(){
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Capacity: " + capacity);
    }

    public int getCapacity(){
        return capacity;
    }
    
    public int getCost(){
        return cost;
    }

    public String getName(){ return name; }
    public String getDescription(){ return description; }

    

}
