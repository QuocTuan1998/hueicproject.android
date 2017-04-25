package app.hueic.hueicprojectdoanthanhnien.model;

import java.util.Date;

/**
 * Created by Admin on 4/25/2017.
 */

public class Students {
    private int IDStudents;
    private String fullNameStudents;
    private int subroleIDStudents;
    private int useIDStudents;
    private Date birthDayStudents;
    private String homeTownStudents;
    private String whereNowStudents;
    private String PhoneStudents;
    private Faculty facultyStudents;
    public YourBranch yourBranchStudents;
    private String cardNumberStudents;

    public int getIDStudents() {
        return IDStudents;
    }

    public void setIDStudents(int IDStudents) {
        this.IDStudents = IDStudents;
    }

    public String getFullNameStudents() {
        return fullNameStudents;
    }

    public void setFullNameStudents(String fullNameStudents) {
        this.fullNameStudents = fullNameStudents;
    }

    public int getSubroleIDStudents() {
        return subroleIDStudents;
    }

    public void setSubroleIDStudents(int subroleIDStudents) {
        this.subroleIDStudents = subroleIDStudents;
    }

    public int getUseIDStudents() {
        return useIDStudents;
    }

    public void setUseIDStudents(int useIDStudents) {
        this.useIDStudents = useIDStudents;
    }

    public Date getBirthDayStudents() {
        return birthDayStudents;
    }

    public void setBirthDayStudents(Date birthDayStudents) {
        this.birthDayStudents = birthDayStudents;
    }

    public String getHomeTownStudents() {
        return homeTownStudents;
    }

    public void setHomeTownStudents(String homeTownStudents) {
        this.homeTownStudents = homeTownStudents;
    }

    public String getWhereNowStudents() {
        return whereNowStudents;
    }

    public void setWhereNowStudents(String whereNowStudents) {
        this.whereNowStudents = whereNowStudents;
    }

    public String getPhoneStudents() {
        return PhoneStudents;
    }

    public void setPhoneStudents(String phoneStudents) {
        PhoneStudents = phoneStudents;
    }

    public Faculty getFacultyStudents() {
        return facultyStudents;
    }

    public void setFacultyStudents(Faculty facultyStudents) {
        this.facultyStudents = facultyStudents;
    }

    public YourBranch getYourBranchStudents() {
        return yourBranchStudents;
    }

    public void setYourBranchStudents(YourBranch yourBranchStudents) {
        this.yourBranchStudents = yourBranchStudents;
    }

    public String getCardNumberStudents() {
        return cardNumberStudents;
    }

    public void setCardNumberStudents(String cardNumberStudents) {
        this.cardNumberStudents = cardNumberStudents;
    }
}
