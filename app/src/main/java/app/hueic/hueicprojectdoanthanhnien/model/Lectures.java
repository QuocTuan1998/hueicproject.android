package app.hueic.hueicprojectdoanthanhnien.model;

import java.util.Date;

/**
 * Created by Admin on 4/25/2017.
 */

public class Lectures {
    private int IDLectures;
    private String fullNameLectures;
    private int subroleIDLectures;
    private int userIDLectures;
    private Date birthDayLectures;
    private String homeTownLectures;
    private String whereNowLectures;
    private String PhoneLectures;
    private Faculty facultyLectures;
    public YourBranch yourBranchLectures;
    private String cardNumberLectures;

    public int getIDLectures() {
        return IDLectures;
    }

    public void setIDLectures(int IDLectures) {
        this.IDLectures = IDLectures;
    }

    public String getFullNameLectures() {
        return fullNameLectures;
    }

    public void setFullNameLectures(String fullNameLectures) {
        this.fullNameLectures = fullNameLectures;
    }

    public int getSubroleIDLectures() {
        return subroleIDLectures;
    }

    public void setSubroleIDLectures(int subroleIDLectures) {
        this.subroleIDLectures = subroleIDLectures;
    }

    public int getUserIDLectures() {
        return userIDLectures;
    }

    public void setUserIDLectures(int userIDLectures) {
        this.userIDLectures = userIDLectures;
    }

    public Date getBirthDayLectures() {
        return birthDayLectures;
    }

    public void setBirthDayLectures(Date birthDayLectures) {
        this.birthDayLectures = birthDayLectures;
    }

    public String getHomeTownLectures() {
        return homeTownLectures;
    }

    public void setHomeTownLectures(String homeTownLectures) {
        this.homeTownLectures = homeTownLectures;
    }

    public String getWhereNowLectures() {
        return whereNowLectures;
    }

    public void setWhereNowLectures(String whereNowLectures) {
        this.whereNowLectures = whereNowLectures;
    }

    public String getPhoneLectures() {
        return PhoneLectures;
    }

    public void setPhoneLectures(String phoneLectures) {
        PhoneLectures = phoneLectures;
    }

    public Faculty getFacultyLectures() {
        return facultyLectures;
    }

    public void setFacultyLectures(Faculty facultyLectures) {
        this.facultyLectures = facultyLectures;
    }

    public YourBranch getYourBranchLectures() {
        return yourBranchLectures;
    }

    public void setYourBranchLectures(YourBranch yourBranchLectures) {
        this.yourBranchLectures = yourBranchLectures;
    }

    public String getCardNumberLectures() {
        return cardNumberLectures;
    }

    public void setCardNumberLectures(String cardNumberLectures) {
        this.cardNumberLectures = cardNumberLectures;
    }
}
