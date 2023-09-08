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

    public void addActivity(activity a){
        activities.add(a);
    }

    public void listActivitiesHasSpace(){
        for(int i=0;i<activities.size();i++){
            if(activities.get(i).hasSpace()) activities.get(i).details();
        }
    }
}
