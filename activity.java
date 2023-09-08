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

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean hasSpace(){
        return availableSpace!=0;
    }

    public boolean signActivity(passenger p){
        if(!hasSpace()) return false;
        float value = cost - (p.getMembership()=="standard" ? 0 : (p.getMembership()=="gold" ? 0.1f*cost : cost));
        if(value<p.getBalance()) return false;
        availableSpace--; return true;
    }

    public void getDetails(){
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
