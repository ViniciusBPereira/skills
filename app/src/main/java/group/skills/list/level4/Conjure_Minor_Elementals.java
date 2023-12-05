package group.skills.list.level4;

public class Conjure_Minor_Elementals {
    private String name;
    private String level;
    private String type;
    private String action;
    private String distance;
    private String time;

    public Conjure_Minor_Elementals() {
        this.name = "Conjure Minor Elemental";
        this.level = "Level 4";
        this.type = "Conjuration";
        this.action = "1 Action";
        this.distance = "90 Feet";
        this.time = "Concentration, up to 1 hour";
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
