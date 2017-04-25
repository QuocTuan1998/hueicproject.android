package app.hueic.hueicprojectdoanthanhnien.model;

/**
 * Created by kenhoang on 4/24/17.
 */

public class Role {
    private int IDRole;
    private String nameRole;
    private String descriptionRole;

    public int getIDRole() {
        return IDRole;
    }

    public void setIDRole(int IDRole) {
        this.IDRole = IDRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }
}
