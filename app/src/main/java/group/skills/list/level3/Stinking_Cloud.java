package group.skills.list.level3;

public class Stinking_Cloud {
    private String name;
    private String level;
    private String type;
    private String action;
    private String distance;
    private String time;

    public Stinking_Cloud() {
        this.name = "Stinking Cloud";
        this.level = "Level 3";
        this.type = "Conjuration";
        this.action = "1 Action";
        this.distance = "90 Feet";
        this.time = "Concentration, up to 1 minute";
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
