import java.util.ArrayList;
import java.util.List;

public class passenger{
    private String name;
    private int number;
    private String membership;
    private List<activity> signedActivities;
    private float balance;
    
    public String getMembership(){
        return membership;
    }

    public float getBalance(){
        return balance;
    }

    public void payAmount(float cost){
        balance-=cost;
    }

    public passenger(String name, int number, String membership, float balance){
        this.name = name;
        this.number = number;
        this.membership = membership;
        this.signedActivities = new ArrayList<activity>();  
        this.balance = balance;
    }

    public void addBalance(float addedBalance){
        if(addedBalance<=0){
            System.out.println("Amount to be added must be greater than zero");
        }
        else{
            this.balance += addedBalance;
        }
    }

    public void getInformation(){
        System.out.println("Name of Passenger: " + name);
        System.out.println("Number of Passenger: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Activities signed by passenger: ");
        for(int i=0;i<signedActivities.size();i++){
            System.out.println(i+1 + " Activity");
            signedActivities.get(i).getDetails();
        }

    }
    public void addActivity(activity a){
        if(a.signActivity(this)){
            signedActivities.add(a);
        }
        else{
            System.out.println("You are not eligible to signed for this activity");
        }
    }
}