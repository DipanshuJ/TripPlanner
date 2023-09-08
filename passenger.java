import java.util.ArrayList;
import java.util.List;

public class passenger{
    private String name;
    private int number;
    String membership;
    private List<activity> activities;
    float balance;
    
    public passenger(String name, int number, String membership, float balance){
        this.name = name;
        this.number = number;
        this.membership = membership;
        this.activities = new ArrayList<activity>();  
        this.balance = balance;
    }

    public void addBalance(float val){
        if(val<=0){
            System.out.println("Amount to be added must be greater than zero");
        }
        else{
            this.balance += val;
        }
    }

    public void getInformation(){
        System.out.println("Name of Passenger: " + name);
        System.out.println("Number of Passenger: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Activities signed by passenger: ");
        for(int i=0;i<activities.size();i++){
            activity a = activities.get(i);
            System.out.println(i+1 + " Activity");
            a.details();
        }

    }
    public void addActivity(activity a){
        if(a.signActivity(this)){
            activities.add(a);
        }
        else{
            System.out.println("You are not eligible to signed for this activity");
        }
    }
}