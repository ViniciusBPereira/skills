package group.skills.list.level8;

public class Mighty_Fortress {
    private String name;
    private String level;
    private String type;
    private String action;
    private String distance;
    private String time;

    public Mighty_Fortress() {
        this.name = "Mighty Fortress";
        this.level = "Level 8";
        this.type = "Conjuration";
        this.action = "1 Minute";
        this.distance = "1 Mile";
        this.time = "Instantaneous";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
