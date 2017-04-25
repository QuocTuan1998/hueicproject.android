package app.hueic.hueicprojectdoanthanhnien.model;

/**
 * Created by Admin on 4/25/2017.
 */

public class Subrole {
    private int SubroleID;
    private int roleID;
    private int appID;
    private String nameSubrole;
    private String descriptionSubrole;

    public int getSubroleID() {
        return SubroleID;
    }

    public void setSubroleID(int subroleID) {
        SubroleID = subroleID;
    }

    public String getNameSubrole() {
        return nameSubrole;
    }

    public void setNameSubrole(String nameSubrole) {
        this.nameSubrole = nameSubrole;
    }

    public String getDescriptionSubrole() {
        return descriptionSubrole;
    }

    public void setDescriptionSubrole(String descriptionSubrole) {
        this.descriptionSubrole = descriptionSubrole;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }
}
