package models;

import java.util.List;

/**
 * Created by nivas on 29/10/16.
 */
public class OOPS {

    private String id;
    private int resources;
    private int budget;
    private int capabilityPoints;
    private int capabilityBonus;
    private String message;

public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getCapabilityPoints() {
        return capabilityPoints;
    }

    public void setCapabilityPoints(int capabilityPoints) {
        this.capabilityPoints = capabilityPoints;
    }

    public int getCapabilityBonus() {
        return capabilityBonus;
    }

    public void setCapabilityBonus(int capabilityBonus) {
        this.capabilityBonus = capabilityBonus;
    }


}
