import java.util.ArrayList;
import java.util.List;

public class place {
    private String name;
    private List<activity> activities;

    public place(String name){
        this.name = name;
        this.activities = new ArrayList<activity>();
    }

    public place(String name, List<activity>activities){
        this.name = name;
        this.activities = activities;
    }

    public String getName(){
        return name;
    }

    public void addActivity(activity act){
        activities.add(act);
    }

    public void printAllActivities(){
        System.out.println("Activities: ");
        for(int i=0;i<activities.size();i++){
            System.out.print((i+1) + ". ");
            activities.get(i).getDetails();
        }
    }

    public void printActivitiesHasSpace(){
        for(int i=0;i<activities.size();i++){
            if(activities.get(i).hasSpace()) activities.get(i).getDetails();
        }
    }
}
