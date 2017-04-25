package app.hueic.hueicprojectdoanthanhnien.model;

import java.util.Date;

/**
 * Created by Admin on 4/25/2017.
 */

public class Activity {
    private int IDActivity;
    private String nameString;
    private Date dateActivity;
    private String locationActivity;
    private double scoreActivity;
    private Status statusActivity;
    private boolean isDeleted;
    private String content;

    public int getIDActivity() {
        return IDActivity;
    }

    public void setIDActivity(int IDActivity) {
        this.IDActivity = IDActivity;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public Date getDateActivity() {
        return dateActivity;
    }

    public void setDateActivity(Date dateActivity) {
        this.dateActivity = dateActivity;
    }

    public String getLocationActivity() {
        return locationActivity;
    }

    public void setLocationActivity(String locationActivity) {
        this.locationActivity = locationActivity;
    }

    public double getScoreActivity() {
        return scoreActivity;
    }

    public void setScoreActivity(double scoreActivity) {
        this.scoreActivity = scoreActivity;
    }

    public Status getStatusActivity() {
        return statusActivity;
    }

    public void setStatusActivity(Status statusActivity) {
        this.statusActivity = statusActivity;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
